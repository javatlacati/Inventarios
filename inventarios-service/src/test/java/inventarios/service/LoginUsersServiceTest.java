package inventarios.service;

import inventarios.repository.LoginUsersRepository;
import inventarios.to.LoginUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
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
    public void login() {
    }

    @Test
    public void save() {
    }
}
