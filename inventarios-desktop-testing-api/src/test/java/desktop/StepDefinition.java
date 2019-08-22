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
import inventarios.desktop.pageobjects.LoginWindowPageObject;
import inventarios.desktop.pageobjects.MainMenuPageObject;
import inventarios.service.LoginUsersService;
import inventarios.service.ProductService;
import inventarios.to.LoginUser;
import inventarios.util.FontFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.swing.JFrame;
import java.awt.Font;

/**
 *
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

    @Mock
    private LoginUsersService usersService;

    @Mock
    private LocalValidatorFactoryBean validatorFactory;

    @Mock
    private Credits credits;

    @Mock
    private FontFactory fontFactory;

    @Mock
    private NavigationHandler navigationHandler;

    {
        Mockito.when(
                fontFactory
                        .getFont(
                                Matchers.anyString()
                        )
        ).thenReturn(
                new Font("serif", Font.PLAIN, 24)
        );
        loginWindow = new LoginWindow(navigationHandler, usersService, fontFactory);
    }

    @InjectMocks
    private LoginWindow loginWindow;

    @InjectMocks
    private Menu menu;

    @InjectMocks
    private InventoryManagement inventoryManagement;
    
    //api objects
    private LoginWindowPageObject loginWindowPageObject;
    private MainMenuPageObject menuPageObject;
    
    @Given("^I write login credentials using user \\'([A-Za-z]+)\\' and password \\'([A-Za-z]+)\\'$")
    public void writeLoginFields(String nickName, String password){
        loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginWindow.setVisible(true);
        
        loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent(nickName);
        loginWindowPageObject.setPasswordFieldContent(password);
    }
    
    @And("^I click Login with wrong credentials$")
    public void clickLoginButtonWithWrongCredentials(){
        Mockito.when(usersService.authenticate(Matchers.any(LoginUser.class)))
                .thenReturn(Boolean.FALSE);
        loginWindowPageObject.clickAccept();
        Mockito.verify(usersService, Mockito.times(1)).authenticate(Matchers.any(LoginUser.class));
    }
    
    @Then("^error prompt should appear$")
    public void errorPromptShouldAppear(){
        loginWindowPageObject.userNotFoundIsShown();
    }
    
    @And("^I click Login with correct credentials$")
    public void clickLoginButtonWithCorrectCredentials(){
        Mockito.when(usersService.authenticate(Matchers.any(LoginUser.class)))
                .thenReturn(true);
        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(false);
                menu.setVisible(true);
                return null;
            }
        }).when(navigationHandler).goToMenu(Matchers.any(JFrame.class));
        loginWindowPageObject.clickAcceptAndWait();
        Mockito.verify(usersService, Mockito.times(1)).authenticate(Matchers.any(LoginUser.class));
        menuPageObject = new MainMenuPageObject();
    }
    
    @And("^I click the clear fields button$")
    public void clickClearFields(){
        loginWindowPageObject.clickClear();
    }
    
    @Then("^Login window fields should be empty$")
    public void verifyEmptyLoginFields(){
        Assert.assertEquals("", loginWindowPageObject.getUserFieldContent());
        Assert.assertEquals("", loginWindowPageObject.getPasswordFieldContent());
    }
    
    
}
