package inventarios;

import inventarios.desktop.LoginWindow;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication
public class Inventarios {
    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(Inventarios.class)
                        .headless(false)
                        .web(WebApplicationType.NONE)
                        .run(args);
        SwingUtilities.invokeLater(() -> {
            LoginWindow loginWindow = context.getBean(LoginWindow.class);
            loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginWindow.setVisible(true);
        });
    }
}
