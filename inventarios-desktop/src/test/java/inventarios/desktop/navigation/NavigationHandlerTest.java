package inventarios.desktop.navigation;

import org.junit.Before;
import org.junit.Test;

import javax.swing.JFrame;

import static org.junit.Assert.*;

public class NavigationHandlerTest {

    private NavigationHandler navigationHandler;
    private JFrame origin;

    @Before
    public void setUp() throws Exception {
        origin = new JFrame();
    }

    @Test
    public void goToFrame() {
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToMenu() {
        navigationHandler.goToMenu(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToInventoryManagement() {
        navigationHandler.goToInventoryManagement(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToShopping() {
        navigationHandler.goToShopping(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToOrderManagement() {
        navigationHandler.goToOrderManagement(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToProviderManagement() {
        navigationHandler.goToProviderManagement(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToBillingManagement() {
        navigationHandler.goToBillingManagement(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToInformation() {
        navigationHandler.goToInformation(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToLogin() {
        navigationHandler.goToLogin(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToEmployeeRegistration() {
        navigationHandler.goToEmployeeRegistration(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToCredits() {
        navigationHandler.goToCredits(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToProductList() {
        navigationHandler.goToProductList(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToOrderList() {
        navigationHandler.goToOrderList(origin);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void goToShoppingList() {
        navigationHandler.goToShoppingList(origin);
    }
}
