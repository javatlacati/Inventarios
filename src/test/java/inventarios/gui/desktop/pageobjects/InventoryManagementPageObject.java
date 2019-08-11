package inventarios.gui.desktop.pageobjects;

import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import java.util.ResourceBundle;
import org.netbeans.jemmy.ComponentSearcher;
import org.netbeans.jemmy.operators.JButtonOperator;

public class InventoryManagementPageObject {
    private ContainerOperator containerFrame;
    private ResourceBundle bundle;
    private JButtonOperator btnClose;

    public InventoryManagementPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        containerFrame = new JFrameOperator(bundle.getString("InventoryManagement.title")); // NOI18N
        btnClose = new JButtonOperator(containerFrame, ComponentSearcher.getTrueChooser("btnClose")); // NOI18N
    }
    
    public void clickClose(){
        btnClose.clickMouse();
    }
}
