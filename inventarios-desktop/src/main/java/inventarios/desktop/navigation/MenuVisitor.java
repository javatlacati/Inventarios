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
import org.springframework.stereotype.Component;

import javax.swing.JFrame;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Component
public class MenuVisitor extends NavigationHandler {
    
    @Override
    public void goToMenu(JFrame origin) {
        throw new UnsupportedOperationException("You can't navitage from menu to itself.");
    }

    @Override
    public void goToInventoryManagement(JFrame origin) {
        InventoryManagement inventoryManagement = context.getBean(InventoryManagement.class);
        inventoryManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToShopping(JFrame origin) {
        ShoppingWindow shoppingWindow = context.getBean(ShoppingWindow.class);
        shoppingWindow.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToOrderManagement(JFrame origin) {
        OrderManagement orderManagement = context.getBean(OrderManagement.class);
        orderManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToProviderManagement(JFrame origin) {
        ProviderManagement providerManagement = context.getBean(ProviderManagement.class);
        providerManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToBillingManagement(JFrame origin) {
        BillingManagement billingManagement = context.getBean(BillingManagement.class);
        billingManagement.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToInformation(JFrame origin) {
        Information information = context.getBean(Information.class);
        information.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToLogin(JFrame origin) {
        LoginWindow loginWindow = context.getBean(LoginWindow.class);
        origin.dispose();
        // TODO perhaps clear previouses here
        loginWindow.setVisible(true);
    }

    @Override
    public void goToEmployeeRegistration(JFrame origin) {
        EmployeeRegistration employeeRegistration = context.getBean(EmployeeRegistration.class);
        employeeRegistration.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToCredits(JFrame origin) {
        Credits credits = context.getBean(Credits.class);
        credits.setVisible(true);
        origin.dispose();
    }

    @Override
    public void goToProductList(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void goToOrderList(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void goToShoppingList(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
