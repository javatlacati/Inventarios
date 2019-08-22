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

import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import java.util.ResourceBundle;

public class InventoryManagementPageObject {
    private ContainerOperator containerFrame;
    private ResourceBundle bundle;
    private JButtonOperator btnClose;
    private JButtonOperator btnMenu;

    public InventoryManagementPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        containerFrame = new JFrameOperator(bundle.getString("InventoryManagement.title")); // NOI18N
        btnClose = new JButtonOperator(containerFrame, bundle.getString("InventoryManagement.btnClose.text")); // NOI18N
        btnMenu = new JButtonOperator(containerFrame, bundle.getString("InventoryManagement.btnMenu.text")); // NOI18N
    }
    
    public void clickClose(){
        btnClose.clickMouse();
    }

    public void clickMenu(){
        btnMenu.clickMouse();
    }
}
