package inventarios.gui.desktop;

import org.junit.jupiter.api.Test;
import org.netbeans.jemmy.operators.ContainerOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JPasswordFieldOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;

class UsuariosTest {

    @Test
    void main() {
        Usuarios.main(new String[]{"hello"});
        ContainerOperator loginWindow =  new JFrameOperator("Inicio Seccion");
        JTextFieldOperator userField = new JTextFieldOperator(loginWindow);
        userField.setText("oscar");
        JPasswordFieldOperator passwordField = new JPasswordFieldOperator(loginWindow);
        passwordField.setText("oscar");
        ContainerOperator containerOperator =  new JFrameOperator("Inicio Seccion");
    }
}
