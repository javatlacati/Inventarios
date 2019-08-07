package inventarios.gui.desktop.pageobjects;

import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import java.util.ResourceBundle;

public class MainMenuPageObject {
    ContainerOperator containerFrame;
    ResourceBundle bundle;

    public MainMenuPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        containerFrame = new JFrameOperator(bundle.getString("Menu.title")); // NOI18N
    }
}
