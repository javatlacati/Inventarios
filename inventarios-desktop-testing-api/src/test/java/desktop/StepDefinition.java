/*
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package desktop;

import inventarios.desktop.BillingManagement;
import inventarios.desktop.Credits;
import inventarios.desktop.EmployeeRegistration;
import inventarios.desktop.Information;
import inventarios.desktop.InventoryManagement;
import inventarios.desktop.ListaProductos;
import inventarios.desktop.LoginWindow;
import inventarios.desktop.Menu;
import inventarios.desktop.OrderManagement;
import inventarios.desktop.ProviderManagement;
import inventarios.desktop.ShoppingWindow;
import inventarios.desktop.navigation.NavigationHandler;
import inventarios.desktop.pageobjects.BillingManagementPageObject;
import inventarios.desktop.pageobjects.InventoryManagementPageObject;
import inventarios.desktop.pageobjects.LoginWindowPageObject;
import inventarios.desktop.pageobjects.MainMenuPageObject;
import inventarios.desktop.pageobjects.OrderManagementPageObject;
import inventarios.service.restclient.LoginUsersService;
import inventarios.service.restclient.ProductService;
import inventarios.to.LoginUser;
import inventarios.util.FontFactory;
import inventarios.util.ShutdownManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.swing.JFrame;
import java.awt.Font;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
public class StepDefinition {

    @Mock
    private ShoppingWindow shoppingWindow;

    @InjectMocks
    private OrderManagement orderManagement;

    @Mock
    private ProviderManagement providerManagement;

    @Mock
    private BillingManagement billingManagement;

    @Mock
    private Information information;

    @Mock
    private EmployeeRegistration employeeRegistration;

    @Mock
    private ListaProductos listaProductos;

    @Mock
    private ProductService productService;

    private LoginUsersService usersService;

    @Mock
    private LocalValidatorFactoryBean validatorFactory;

    private Credits credits;

    private FontFactory fontFactory;

    private NavigationHandler navigationHandler;

    private LoginWindow loginWindow;

    private Menu menu;

    private InventoryManagement inventoryManagement;

    private ShutdownManager shutdownManager;

    //api objects
    private LoginWindowPageObject loginWindowPageObject;
    private MainMenuPageObject menuPageObject;
    private InventoryManagementPageObject inventoryPageObject;
    private OrderManagementPageObject orderPageObject;
    private BillingManagementPageObject billingManagementPageObject;

    @Before
    public void beforeScenario() {
        usersService = mock(LoginUsersService.class);
        navigationHandler = mock(NavigationHandler.class);
        shutdownManager = mock(ShutdownManager.class);
        fontFactory = mock(FontFactory.class);
        when(
                fontFactory
                        .getFont(
                                Matchers.anyString()
                        )
        ).thenReturn(
                new Font("serif", Font.PLAIN, 24)
        );
        loginWindow = new LoginWindow(navigationHandler, usersService, fontFactory, shutdownManager);
        menu = new Menu(navigationHandler, shutdownManager);
        inventoryManagement = new InventoryManagement(navigationHandler, productService, validatorFactory, shutdownManager);
        billingManagement = new BillingManagement(navigationHandler, shutdownManager);
    }

    @After
    public void afterScenario() {
        reset(usersService);
        loginWindow.dispose();
    }

    @Given("^I write login credentials using user \\'([A-Za-z]+)\\' and password \\'([A-Za-z]+)\\'$")
    public void writeLoginFields(String nickName, String password) {
        loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginWindow.setVisible(true);
        loginWindowPageObject = new LoginWindowPageObject();

        loginWindowPageObject.setUserFieldContent(nickName);
        loginWindowPageObject.setPasswordFieldContent(password);
    }

    @And("^I click Login with wrong credentials$")
    public void clickLoginButtonWithWrongCredentials() {
        //reset(usersService);
        doReturn(Boolean.FALSE)
                .when(usersService)
                .authenticate(Matchers.any(LoginUser.class));
        loginWindowPageObject.clickAccept();
    }

    @Then("^error prompt should appear$")
    public void errorPromptShouldAppear() {
        loginWindowPageObject.userNotFoundMessageDialogIsShown();
        verify(usersService, times(1)).authenticate(Matchers.any(LoginUser.class));
    }

    @And("^I click Login with correct credentials$")
    public void clickLoginButtonWithCorrectCredentials() {
        //reset(usersService);
        doReturn(Boolean.TRUE)
                .when(usersService)
                .authenticate(Matchers.any(LoginUser.class));
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                loginWindow.setVisible(false);
                menu.add(loginWindow);
                menu.setVisible(true);
                return null;
            }
        }).when(navigationHandler).goToMenu(Matchers.any(JFrame.class));
        loginWindowPageObject.clickAccept();
        menuPageObject = new MainMenuPageObject();
    }

    @And("^I click the clear fields button$")
    public void clickClearFields() {
        loginWindowPageObject.clickClear();
    }

    @Then("^Login window fields should be empty$")
    public void verifyEmptyLoginFields() {
        assertEquals("Ingresa tu usuario", loginWindowPageObject.getUserFieldContent());
        assertEquals("", loginWindowPageObject.getPasswordFieldContent());
    }

    @And("^I click Inventory option in the Menu Window$")
    public void iClickInventoryOptionInTheMenuWindow() {
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(true);
                menu.setVisible(false);
                return null;
            }
        })
                .when(navigationHandler)
                .goToInventoryManagement(Matchers.any(Menu.class));
        menuPageObject.openInvenory();
        inventoryPageObject = new InventoryManagementPageObject();
    }
    
    @And("^I click Billing option in the Menu Window$")
    public void iClickBillingOptionInTheMenuWindow() {
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                billingManagement.setVisible(true);
                menu.setVisible(false);
                return null;
            }
        })
                .when(navigationHandler)
                .goToInventoryManagement(Matchers.any(Menu.class));
        menuPageObject.openInvenory();
        billingManagementPageObject = new BillingManagementPageObject();
    }

    @And("^I click on menu button in the Inventory Window$")
    public void iClickOnCloseButtonInTheInventoryWindow() {
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(false);
                menu.setVisible(true);
                return null;
            }
        }).when(navigationHandler).goToMenu(Matchers.any(InventoryManagement.class));
        inventoryPageObject.clickMenu();
    }
    
    @And("^I click on menu button in the Billing Window$")
    public void iClickOnMenuButtonInTheInventoryWindow() {
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                billingManagement.setVisible(false);
                menu.setVisible(true);
                return null;
            }
        }).when(navigationHandler).goToMenu(Matchers.any(BillingManagement.class));
        billingManagementPageObject.clickMenu();
    }
    
    @And("^error prompt message should be \'([A-Za-z\\s]+)\'$")
    public void errorPromptMessageShouldBeUsuarioWrongNoEncontrado(String expectedMessage) {
        assertEquals("error message in message dialog should be as expected", expectedMessage, loginWindowPageObject.getDialogMessageText());
    }

    @Then("^I click close button on prompt message$")
    public void iClickCloseButtonOnPromptMessage() {
        loginWindowPageObject.closeUserNotFoundMesssageDialog();
    }

    @And("^I click close button on The Menu Window$")
    public void iClickCloseButtonOnMenu() {
        menuPageObject.goToLogin();
    }
}
