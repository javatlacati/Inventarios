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
import inventarios.desktop.OrderManagement;
import inventarios.desktop.ProviderManagement;
import inventarios.desktop.ShoppingWindow;
import inventarios.service.LoginUsersService;
import inventarios.service.ProductService;
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
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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

    @Before
    public void setUp() throws Exception {
        when(
                fontFactory.getFont(
                        anyString()
                )
        ).thenReturn(
                new Font("serif", Font.PLAIN, 24)
        );
        loginWindow = new LoginWindow(usersService, menu, fontFactory);
        loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginWindow.setVisible(true);
        menu = new Menu(loginWindow, inventoryManagement, shoppingWindow, orderManagement, providerManagement, billingManagement, information, employeeRegistration, credits);
        inventoryManagement = new InventoryManagement(menu, productService, listaProductos, validatorFactory);
    }

    @After
    public void tearDown() throws Exception {
        loginWindow.setVisible(false);
    }

    @Test
    public void failedLogin() {
        when(usersService.authenticate(any()))
                .thenReturn(Boolean.FALSE);
        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("wrong");
        loginWindowPageObject.setPasswordFieldContent("wrong");
        loginWindowPageObject.clickAccept();
        loginWindowPageObject.userNotFoundIsShown();
        verify(usersService, times(1)).authenticate(any());
    }

    @Test
    public void navigationTest() {
        when(usersService.authenticate(any()))
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
        loginWindowPageObject.clickAcceptAndWait();
        verify(usersService, times(1)).authenticate(any());

        MainMenuPageObject menuPageObject = new MainMenuPageObject();
//        menuPageObject.openInvenory();
//        InventoryManagementPageObject inventoryPageObject = new InventoryManagementPageObject();
//        inventoryPageObject.clickClose();
//        menuPageObject.openOrders();
//        OrderManagementPageObject orderPageObject = new OrderManagementPageObject();
    }
}
