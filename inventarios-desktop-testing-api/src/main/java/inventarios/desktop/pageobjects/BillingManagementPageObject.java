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
package inventarios.desktop.pageobjects;

import java.util.ResourceBundle;
import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
public class BillingManagementPageObject {
    private ResourceBundle bundle;
    private JButtonOperator btnMenu;

    public BillingManagementPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        ContainerOperator containerFrame = new JFrameOperator(bundle.getString("BillingManagement.title")); // NOI18N
        btnMenu = new JButtonOperator(containerFrame, bundle.getString("BillingManagement.btnMenu.text")); // NOI18N
    }
    
    
    
    public void clickMenu() {
        btnMenu.clickMouse();
    }
    
}
