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

import desktop.pageobjects.InventoryManagementPageObject;
import desktop.pageobjects.LoginWindowPageObject;
import desktop.pageobjects.MainMenuPageObject;
import desktop.pageobjects.OrderManagementPageObject;
import inventarios.desktop.BillingManagement;
import inventarios.desktop.Credits;
import inventarios.desktop.EmployeeRegistration;
import inventarios.desktop.Information;
import inventarios.desktop.InventoryManagement;
import inventarios.desktop.ListaProductos;
import inventarios.desktop.LoginWindow;
import inventarios.desktop.Menu;
import inventarios.desktop.navigation.MenuVisitor;
import inventarios.desktop.OrderManagement;
import inventarios.desktop.ProviderManagement;
import inventarios.desktop.ShoppingWindow;
import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.LoginUsersService;
import inventarios.service.ProductService;
import inventarios.to.LoginUser;
import inventarios.util.FontFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.swing.JFrame;
import java.awt.Font;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import org.mockito.Mockito;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

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

    @Mock
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

    @Before
    public void setUp() throws Exception {
        when(
                fontFactory.getFont(
                        anyString()
                )
        ).thenReturn(
                new Font("serif", Font.PLAIN, 24)
        );
        loginWindow = new LoginWindow(navigationHandler, usersService, fontFactory);
        loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginWindow.setVisible(true);
        inventoryManagement = new InventoryManagement(navigationHandler, productService, listaProductos, validatorFactory);
        menu = new Menu(navigationHandler);
    }

    @After
    public void tearDown() throws Exception {
        loginWindow.setVisible(false);
    }

    @Test
    public void failedLogin() {
        when(usersService.authenticate(any(LoginUser.class)))
                .thenReturn(Boolean.FALSE);
        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("wrong");
        loginWindowPageObject.setPasswordFieldContent("wrong");
        loginWindowPageObject.clickAccept();
        loginWindowPageObject.userNotFoundIsShown();
        verify(usersService, times(1)).authenticate(any(LoginUser.class));
    }

    @Test
    public void navigationTest() {
        when(usersService.authenticate(any(LoginUser.class)))
                .thenReturn(true);

        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("wrong");
        loginWindowPageObject.setPasswordFieldContent("wrong");
        loginWindowPageObject.clickClear();
        Assert.assertEquals("", loginWindowPageObject.getUserFieldContent());
        Assert.assertEquals("", loginWindowPageObject.getPasswordFieldContent());
        String user = "oscar";
        loginWindowPageObject.setUserFieldContent(user);
        String password = "oscar";
        loginWindowPageObject.setPasswordFieldContent(password);
        
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(false);
                menu.setVisible(true);
                return null;
            }
        }).when(navigationHandler).goToMenu(any(JFrame.class));
        
        
        loginWindowPageObject.clickAcceptAndWait();
        verify(usersService, times(1)).authenticate(any(LoginUser.class));

        MainMenuPageObject menuPageObject = new MainMenuPageObject();
        
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                inventoryManagement.setVisible(true);
                menu.setVisible(false);
                return null;
            }
        }).when(navigationHandler).goToInventoryManagement(any(JFrame.class));
        
        menuPageObject.openInvenory();
        InventoryManagementPageObject inventoryPageObject = new InventoryManagementPageObject();
        inventoryPageObject.clickClose();
//        menuPageObject.openOrders();
//        OrderManagementPageObject orderPageObject = new OrderManagementPageObject();
    }
}
