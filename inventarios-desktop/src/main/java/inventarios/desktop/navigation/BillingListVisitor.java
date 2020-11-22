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
import inventarios.desktop.Menu;
import org.springframework.stereotype.Component;

import javax.swing.JFrame;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Component
public class BillingListVisitor extends NavigationHandler {

    @Override
    public void goToMenu(JFrame origin) {
        Menu menu = context.getBean(Menu.class);
        menu.setVisible(true);
        menu.addToNavigationHisory(origin);
        origin.setVisible(false);
    }

    @Override
    public void goToBillingManagement(JFrame origin) {
        BillingManagement billingManagement = context.getBean(BillingManagement.class);
        billingManagement.setVisible(true);
        origin.dispose();
    }
}
