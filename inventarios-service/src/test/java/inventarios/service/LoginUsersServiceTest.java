package inventarios.service;

import inventarios.repository.LoginUsersRepository;
import inventarios.to.LoginUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.domain.Example;

import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginUsersServiceTest {

    @InjectMocks
    private LoginUsersService loginUsersService;

    @Mock
    private LoginUsersRepository usersRepository;

    @Before
    public void setUp() throws Exception {
        loginUsersService = new LoginUsersService(usersRepository);
    }

    @Test
    public void findAll() {
        LoginUser user = new LoginUser("username", "pwd");
        when(usersRepository.findAll())
                .thenReturn(Collections.singletonList(user));
        assertEquals(Collections.singletonList(user), loginUsersService.findAll());
    }

    @Test
    public void loginSuccessFull() {
        LoginUser user = new LoginUser("username", "pwd");
        LoginUser userAuthenticated = new LoginUser("username", "pwd");
        userAuthenticated.setActive(true);

        when(usersRepository.findOne(any(Example.class)))
                .thenReturn(Optional.of(userAuthenticated));
        assertTrue(loginUsersService.login(user));
    }

    @Test
    public void loginUnSuccessFull() {
        LoginUser user = new LoginUser("username", "pwd");
        LoginUser userAuthenticated = new LoginUser("username", "pwd");
        userAuthenticated.setActive(false);

        when(usersRepository.findOne(any(Example.class)))
                .thenReturn(Optional.of(userAuthenticated));
        assertFalse(loginUsersService.login(user));
    }

    @Test
    public void save() {
        LoginUser user = new LoginUser("username", "pwd");
        
        LoginUser userAuthenticated = new LoginUser("username", "pwd");
        userAuthenticated.setActive(true);
        when(usersRepository.save(any(LoginUser.class)))
                .thenReturn(user);
        assertEquals(userAuthenticated, loginUsersService.save(user));
    }
}
