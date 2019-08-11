/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop.pageobjects;

import java.util.ResourceBundle;
import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

/**
 *
 * @author Ivana Martinez C
 */
public class OrderManagementPageObject {
    
    private ContainerOperator containerFrame;
    private ResourceBundle bundle;

    public OrderManagementPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        containerFrame = new JFrameOperator(bundle.getString("OrderManagement.title")); // NOI18N
    }
    
}
