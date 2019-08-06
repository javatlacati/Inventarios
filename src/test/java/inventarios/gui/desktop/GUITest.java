package inventarios.gui.desktop;

import inventarios.HeadlessSpringBootContextLoader;
import inventarios.gui.desktop.pageobjects.LoginWindowPageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ContextConfiguration(loader = HeadlessSpringBootContextLoader.class)
public class GUITest {

    @Autowired
    private LoginWindow loginWindow;

    @Test
    public void main() {
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginWindow.setVisible(true);
        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("oscar");
        loginWindowPageObject.setPasswordFieldContent("oscar");
        loginWindowPageObject.clickAccept();
    }
}
