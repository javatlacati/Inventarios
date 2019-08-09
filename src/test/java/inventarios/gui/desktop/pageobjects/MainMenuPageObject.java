package inventarios.gui.desktop.pageobjects;

import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import java.util.ResourceBundle;

public class MainMenuPageObject {
    private ContainerOperator containerFrame;
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
        containerFrame = new JFrameOperator(bundle.getString("Menu.title")); // NOI18N
        btnClose = new JButtonOperator(containerFrame, bundle.getString("Menu.btnClose.text")); // NOI18N
        btnGetBack = new JButtonOperator(containerFrame, bundle.getString("Menu.btnClose.text")); // NOI18N
        btnInventory = new JButtonOperator(containerFrame, bundle.getString("Menu.btnInventory.text")); // NOI18N
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
}
