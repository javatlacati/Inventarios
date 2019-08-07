package inventarios.gui.desktop;

import inventarios.HeadlessSpringBootContextLoader;
import inventarios.gui.desktop.pageobjects.LoginWindowPageObject;
import inventarios.gui.desktop.pageobjects.MainMenuPageObject;
import org.junit.After;
import org.junit.Before;
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

    @Before
    public void setUp() throws Exception {
        loginWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginWindow.setVisible(true);
    }

    @After
    public void tearDown() throws Exception {
        loginWindow.setVisible(false);
    }

    @Test
    public void failedLogin() {
        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("wrong");
        loginWindowPageObject.setPasswordFieldContent("wrong");
        loginWindowPageObject.clickAccept();
        loginWindowPageObject.userNotFoundIsShown();
    }

    @Test
    public void successFulLogin() {
        LoginWindowPageObject loginWindowPageObject = new LoginWindowPageObject();
        loginWindowPageObject.setUserFieldContent("oscar");
        loginWindowPageObject.setPasswordFieldContent("oscar");
        loginWindowPageObject.clickAcceptAndWait();
        MainMenuPageObject menuPageObject = new MainMenuPageObject();
    }
}
