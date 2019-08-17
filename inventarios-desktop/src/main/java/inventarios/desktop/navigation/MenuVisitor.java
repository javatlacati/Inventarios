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
package inventarios.desktop.navigation;

import inventarios.desktop.BillingManagement;
import inventarios.desktop.Credits;
import inventarios.desktop.EmployeeRegistration;
import inventarios.desktop.Information;
import inventarios.desktop.InventoryManagement;
import inventarios.desktop.LoginWindow;
import inventarios.desktop.OrderManagement;
import inventarios.desktop.ProviderManagement;
import inventarios.desktop.ShoppingWindow;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Component
public class MenuVisitor extends NavigationHandler {

    @Autowired
    @Lazy
    private InventoryManagement inventoryManagement;

    @Autowired
    @Lazy
    private ShoppingWindow shoppingWindow;

    @Autowired
    @Lazy
    private OrderManagement orderManagement;

    @Autowired
    @Lazy
    private ProviderManagement providerManagement;

    @Autowired
    @Lazy
    private BillingManagement billingManagement;

    @Autowired
    @Lazy
    private Information information;

    @Autowired
    private LoginWindow loginWindow;

    @Autowired
    @Lazy
    private EmployeeRegistration employeeRegistration;

    @Autowired
    @Lazy
    private Credits credits;

    @Override
    public void goToMenu(JFrame origin) {
        throw new UnsupportedOperationException("You can't navitage from menu to itself.");
    }

    @Override
    public void goToInventoryManagement(JFrame origin) {
        inventoryManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToShopping(JFrame origin) {
        shoppingWindow.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToOrderManagement(JFrame origin) {
        orderManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToProviderManagement(JFrame origin) {
        providerManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToBillingManagement(JFrame origin) {
        billingManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToInformation(JFrame origin) {
        information.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToLogin(JFrame origin) {
        origin.dispose();
        loginWindow.setVisible(true);
    }

    @Override
    public void goToEmployeeRegistration(JFrame origin) {
        employeeRegistration.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToCredits(JFrame origin) {
        credits.setVisible(true);
        origin.dispose();
    }
}
