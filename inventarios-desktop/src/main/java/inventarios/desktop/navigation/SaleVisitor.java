package inventarios.desktop.navigation;

import inventarios.desktop.Menu;

import javax.swing.JFrame;
import org.springframework.stereotype.Component;

@Component
public class SaleVisitor extends NavigationHandler {
    @Override
    public void goToMenu(JFrame origin) {
        Menu menu = context.getBean(Menu.class);
        menu.removeLast();
        menu.setVisible(true);
        origin.dispose();
    }
}
