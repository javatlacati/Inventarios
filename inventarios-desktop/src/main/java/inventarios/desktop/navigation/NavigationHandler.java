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

import javax.swing.JFrame;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
public abstract class NavigationHandler {

    public void goToFrame(JFrame origin, JFrame target) {
        target.setVisible(true);
        origin.dispose();
    }

    public abstract void goToMenu(JFrame origin);

    public abstract void goToInventoryManagement(JFrame origin);

    public abstract void goToShopping(JFrame origin);

    public abstract void goToOrderManagement(JFrame origin);

    public abstract void goToProviderManagement(JFrame origin);

    public abstract void goToBillingManagement(JFrame origin);

    public abstract void goToInformation(JFrame origin);

    public abstract void goToLogin(JFrame origin);

    public abstract void goToEmployeeRegistration(JFrame origin);

    public abstract void goToCredits(JFrame origin);
}
