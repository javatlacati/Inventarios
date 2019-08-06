package inventarios.gui.desktop.pageobjects;

import org.netbeans.jemmy.operators.*;

public class LoginWindowPageObject {
    ContainerOperator containerFrame;
    JTextFieldOperator userField;
    JPasswordFieldOperator passwordField;
    JButtonOperator btnAccept;
    JButtonOperator btnCancel;

    public LoginWindowPageObject() {
        containerFrame = new JFrameOperator("Inicio Seccion");
        userField = new JTextFieldOperator(containerFrame);
        passwordField = new JPasswordFieldOperator(containerFrame);
        btnAccept = new JButtonOperator(containerFrame, 0);
        btnCancel = new JButtonOperator(containerFrame, 1);
    }

    public String getUserFieldContent() {
        return userField.getText();
    }

    public void setUserFieldContent(String user) {
        userField.setText(user);
    }

    public String getPasswordFieldContent() {
        return passwordField.getText();
    }

    public void setPasswordFieldContent(String password) {
        passwordField.setText(password);
    }

    public void clickAccept() {
        btnAccept.clickMouse();
    }

    public void clickCancel() {
        btnCancel.clickMouse();
    }
}
