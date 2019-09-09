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
import inventarios.desktop.pageobjects.InventoryManagementPageObject;
import inventarios.desktop.pageobjects.LoginWindowPageObject;
import inventarios.desktop.pageobjects.MainMenuPageObject;
import inventarios.desktop.pageobjects.OrderManagementPageObject;
import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.restclient.LoginUsersService;
import inventarios.service.restclient.OrderService;
import inventarios.service.restclient.ProductService;
import inventarios.to.LoginUser;
import inventarios.util.FontFactory;
import inventarios.util.ShutdownManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.swing.JFrame;
import java.awt.Font;

@RunWith(MockitoJUnitRunner.class)
public class GUITest {

    @InjectMocks
    private LoginWindow loginWindow;

    @InjectMocks
    private Menu menu;

    @InjectMocks
    private InventoryManagement inventoryManagement;

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
    private OrderService orderService;

    @Mock
    private LocalValidatorFactoryBean validatorFactory;

    @Mock
    private Credits credits;

    @Mock
    private FontFactory fontFactory;

    @Mock
    private NavigationHandler navigationHandler;

    @Mock
    private ShutdownManager shutdownManager;

    @Before
    public void setUp() throws Exception {
        Mockito.when(
                fontFactory.getFont(
                        Matchers.anyString()
                )
        ).thenReturn(
                new Font("serif", Font.PLAIN, 24)
        );
        loginWindow = new LoginWindow(navigationHandler, usersService, fontFactory, shutdownManager);
        loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginWindow.setVisible(true);
        inventoryManagement = new InventoryManagement(navigationHandler, productService, validatorFactory, shutdownManager);
        menu = new Menu(navigationHandler, shutdownManager);
        orderManagement = new OrderManagement(navigationHandler, orderService, shutdownManager);
    }

    @After
    public void tearDown() throws Exception {
        loginWindow.setVisible(false);
    }

    @Test
    public void failedLogin() {
        Mockito.when(usersService.authenticate(Matchers.any(LoginUser.class)))
                .thenReturn(Boolean.FALSE);
        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("wrong");
        loginWindowPageObject.setPasswordFieldContent("wrong");
        loginWindowPageObject.clickAccept();
        loginWindowPageObject.userNotFoundMessageDialogIsShown();
        loginWindowPageObject.closeUserNotFoundMesssageDialog();
        Mockito.verify(usersService, Mockito.times(1)).authenticate(Matchers.any(LoginUser.class));
    }

    @Test
    public void navigationTest() {
        Mockito.when(usersService.authenticate(Matchers.any(LoginUser.class)))
                .thenReturn(true);

        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("wrong");
        loginWindowPageObject.setPasswordFieldContent("wrong");
        loginWindowPageObject.clickClear();
        Assert.assertEquals("Ingresa tu usuario", loginWindowPageObject.getUserFieldContent());
        Assert.assertEquals("", loginWindowPageObject.getPasswordFieldContent());
        String user = "oscar";
        loginWindowPageObject.setUserFieldContent(user);
        String password = "oscar";
        loginWindowPageObject.setPasswordFieldContent(password);

        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(false);
                menu.setVisible(true);
                return null;
            }
        }).when(navigationHandler).goToMenu(Matchers.any(JFrame.class));

        loginWindowPageObject.clickAcceptAndWait();
        Mockito.verify(usersService, Mockito.times(1)).authenticate(Matchers.any(LoginUser.class));

        MainMenuPageObject menuPageObject = new MainMenuPageObject();

        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(true);
                menu.setVisible(false);
                return null;
            }
        }).when(navigationHandler).goToInventoryManagement(Matchers.any(JFrame.class));

        menuPageObject.openInvenory();
        InventoryManagementPageObject inventoryPageObject = new InventoryManagementPageObject();
        inventoryPageObject.clickClose();
        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                orderManagement.setVisible(true);
                menu.setVisible(false);
                return null;
            }
        }).when(navigationHandler).goToOrderManagement(Matchers.any(JFrame.class));
        menuPageObject.openOrders();
        OrderManagementPageObject orderPageObject = new OrderManagementPageObject();
    }
}
