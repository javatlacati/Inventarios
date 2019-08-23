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
import org.netbeans.jemmy.operators.JFrameOperator;

import java.util.ResourceBundle;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;

/**
 *
 * @author Ivana Martinez C
 */
public class OrderManagementPageObject {
    
    private ResourceBundle bundle;
    private JTextFieldOperator txtAddress;
    private JTextFieldOperator txtEmployee;
    private JTextFieldOperator txtLastName;
    private JTextFieldOperator txtName;
    private JTextFieldOperator txtOrderNo;
    private JTextFieldOperator txtProduct;
    private JTextFieldOperator txtRfc;
    private JTextFieldOperator txtTelephone;
    private JTextFieldOperator txtOrderDate;
    private JButtonOperator btnMenu;
    private JButtonOperator btnGetBack;

    public OrderManagementPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        ContainerOperator containerFrame = new JFrameOperator(bundle.getString("OrderManagement.title")); // NOI18N
        txtAddress = new JTextFieldOperator(containerFrame, 0);
        txtEmployee = new JTextFieldOperator(containerFrame, 1);
        txtLastName = new JTextFieldOperator(containerFrame, 2);
        txtName = new JTextFieldOperator(containerFrame, 3);
        btnMenu = new JButtonOperator(containerFrame, bundle.getString("OrderManagement.btnMenu.text"));  // NOI18N
        btnGetBack = new JButtonOperator(containerFrame, bundle.getString("OrderManagement.btnGetBack.text")); // NOI18N
    }
    
    public void clickMenuButton(){
        btnMenu.clickMouse();
    }
    
    public void clickGetackButton(){
        btnGetBack.clickMouse();
    }
}
