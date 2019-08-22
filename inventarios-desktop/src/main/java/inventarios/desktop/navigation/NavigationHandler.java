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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.swing.JFrame;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
public class NavigationHandler {
    
    @Autowired
    ApplicationContext context;

    public <T extends JFrame> void goToFrame(JFrame origin, Class<T> target) {
        T aFrame = context.getBean(target);
        aFrame.setVisible(true);
        origin.dispose();
    }

    public void goToMenu(JFrame origin) {
        throw new UnsupportedOperationException("You can't navitage from menu to itself.");
    }

    public void goToInventoryManagement(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToShopping(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToOrderManagement(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToProviderManagement(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToBillingManagement(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToInformation(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToLogin(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToEmployeeRegistration(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToCredits(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToProductList(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToOrderList(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void goToShoppingList(JFrame origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
