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

public class MainMenuPageObject {
    private ResourceBundle bundle;
    private JButtonOperator btnClose;
    private JButtonOperator btnGetBack;
    private JButtonOperator btnInventory;
    private JButtonOperator btnOrders;
    private JButtonOperator btnProvider;
    private JButtonOperator btnEmployeeRegistration;
    private JButtonOperator btnTransactions;
    private JButtonOperator btnBilling;
    private JButtonOperator btnAbout;
    private JButtonOperator btnCredits;

    public MainMenuPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        ContainerOperator containerFrame = new JFrameOperator(bundle.getString("Menu.title")); // NOI18N
        btnClose = new JButtonOperator(containerFrame, bundle.getString("Menu.btnClose.text")); // NOI18N
        btnGetBack = new JButtonOperator(containerFrame, bundle.getString("Menu.btnGetBack.text")); // NOI18N
//        btnInventory = new JButtonOperator(containerFrame, bundle.getString("Menu.btnInventory.text")); // NOI18N
        btnOrders = new JButtonOperator(containerFrame, bundle.getString("Menu.btnOrders.text")); // NOI18N
        btnProvider = new JButtonOperator(containerFrame, bundle.getString("Menu.btnProvider.text")); // NOI18N
        btnEmployeeRegistration = new JButtonOperator(containerFrame, bundle.getString("Menu.btnEmployeeRecords.text")); // NOI18N
        btnTransactions = new JButtonOperator(containerFrame, bundle.getString("Menu.btnTransaction.text")); // NOI18N
        btnBilling = new JButtonOperator(containerFrame, bundle.getString("Menu.btnBilling.text")); // NOI18N
        btnAbout = new JButtonOperator(containerFrame, bundle.getString("Menu.btnAbout.text")); // NOI18N
        btnCredits = new JButtonOperator(containerFrame, bundle.getString("Menu.btnCredits.text")); // NOI18N
    }

    public void openInvenory(){
        btnInventory.clickMouse();
    }
    
    public void openOrders(){
        btnOrders.clickMouse();
    }

    public void goToLogin(){
        btnGetBack.clickMouse();
    }
    
    public void goToBilling(){
        btnBilling.clickMouse();
    }
}
