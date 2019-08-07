package inventarios.gui.desktop.pageobjects;

import org.junit.Assert;
import org.netbeans.jemmy.operators.*;

import java.util.ResourceBundle;

public class LoginWindowPageObject {
    ContainerOperator containerFrame;
    JTextFieldOperator userField;
    JPasswordFieldOperator passwordField;
    JButtonOperator btnAccept;
    JButtonOperator btnCancel;
    JDialogOperator userNotFoundMessage;
    ResourceBundle bundle;

    public LoginWindowPageObject() {
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        containerFrame = new JFrameOperator(bundle.getString("LoginWindow.title")); // NOI18N
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
        btnAccept.pushNoBlock();
    }

    public void clickAcceptAndWait() {
        btnAccept.clickMouse();
    }

    public void clickCancel() {
        btnCancel.clickMouse();
    }

    public void userNotFoundIsShown() {
        userNotFoundMessage = new JDialogOperator("Credenciales incorrectas");
        Assert.assertNotNull(userNotFoundMessage);
        JLabelOperator dialogMessage = new JLabelOperator(userNotFoundMessage);
        Assert.assertEquals("Usuario " + userField.getText() + " no encontrado", dialogMessage.getText());
        JButtonOperator jbo = new JButtonOperator(userNotFoundMessage, "Aceptar");
        jbo.push();
        userNotFoundMessage = null;
    }
}
