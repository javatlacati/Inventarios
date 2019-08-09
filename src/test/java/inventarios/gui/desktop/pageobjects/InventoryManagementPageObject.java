package inventarios.gui.desktop.pageobjects;

import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import java.util.ResourceBundle;

public class InventoryManagementPageObject {
    private ContainerOperator containerFrame;
    private ResourceBundle bundle;

    public InventoryManagementPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        containerFrame = new JFrameOperator(bundle.getString("InventoryManagement.title")); // NOI18N
    }
}
