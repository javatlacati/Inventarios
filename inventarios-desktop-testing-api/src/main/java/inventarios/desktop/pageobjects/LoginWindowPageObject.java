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

import org.junit.Assert;
import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JDialogOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JLabelOperator;
import org.netbeans.jemmy.operators.JPasswordFieldOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;

import java.util.ResourceBundle;

public class LoginWindowPageObject {
    private JTextFieldOperator userField;
    private JPasswordFieldOperator passwordField;
    private JButtonOperator btnAccept;
    private JButtonOperator btnClear;
    private JDialogOperator userNotFoundMessage;
    private ResourceBundle bundle;
    private JLabelOperator dialogMessage;

    public LoginWindowPageObject() {
//        Locale.setDefault(Locale.GERMAN);
        bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        ContainerOperator containerFrame = new JFrameOperator(bundle.getString("LoginWindow.title")); // NOI18N
        userField = new JTextFieldOperator(containerFrame);
        passwordField = new JPasswordFieldOperator(containerFrame);
        btnAccept = new JButtonOperator(containerFrame, 0);
        btnClear = new JButtonOperator(containerFrame, 1);
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

    public void clickClear() {
        btnClear.clickMouse();
    }

    public void userNotFoundMessageDialogIsShown() {
        userNotFoundMessage = new JDialogOperator("Credenciales incorrectas");
        Assert.assertNotNull(userNotFoundMessage);
        dialogMessage = new JLabelOperator(userNotFoundMessage);
//        Assert.assertEquals("Usuario " + userField.getText() + " no encontrado", dialogMessage.getText());
    }

    public void closeUserNotFoundMesssageDialog(){
        JButtonOperator jbo = new JButtonOperator(userNotFoundMessage);
        jbo.push();
        userNotFoundMessage = null;
    }

    public String getDialogMessageText() {
        return dialogMessage.getText();
    }
}
