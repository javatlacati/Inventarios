package inventarios.service.authorization;

import inventarios.repository.LoginUsersRepository;
import inventarios.repository.authorization.UserHasRoleRepository;
import inventarios.to.LoginUser;
import inventarios.to.authorization.LoginUserHasRole;
import inventarios.to.authorization.Permission;
import inventarios.to.authorization.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.domain.Example;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AuthorizationServiceTest {

    @InjectMocks
    private AuthorizationService authorizationService;

    @Mock
    private LoginUsersRepository loginUsersRepository;

    @Mock
    private UserHasRoleRepository userHasRoleRepository;

    @Test
    public void userHasPermissionShouldReturnFalseWhenUserDoesNotExists() {
        Optional<LoginUser> loginUser = Optional.empty();

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(loginUser);

        assertFalse(authorizationService.userHasPermission("user", "aPermission"));
    }

    @Test
    public void userHasPermissionShoudReturnFalseWhenRoleIsNotAssociated() {
        Optional<LoginUser> loginUser = Optional.of(new LoginUser("user", "aPassword"));
        Optional<LoginUserHasRole> userHasRole = Optional.empty();

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(loginUser);

        when(userHasRoleRepository.findOne(any(Example.class)))
                .thenReturn(userHasRole);

        assertFalse(authorizationService.userHasPermission("user", "aPermission"));
    }

    @Test
    public void userHasPermissionShoudReturnFalseWhenUserHasNoRoles() {
        LoginUser loginUser = new LoginUser("user", "aPassword");
        List<UserRole> userRoles = Collections.emptyList();
        Optional<LoginUser> userOptional = Optional.of(loginUser);
        Optional<LoginUserHasRole> userHasRole = Optional.of(new LoginUserHasRole(1L, loginUser, userRoles));

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(userOptional);

        when(userHasRoleRepository.findOne(any(Example.class)))
                .thenReturn(userHasRole);

        assertFalse(authorizationService.userHasPermission("user", "aPermission"));
    }

    @Test
    public void userHasPermissionShoudReturnFalseWhenUserHasRolesButNotTheDesiredPermission() {
        LoginUser loginUser = new LoginUser("user", "aPassword");
        UserRole someUserRole = new UserRole(1L, "someRole", Collections.emptyList(), null);
        List<UserRole> userRoles = Collections.singletonList(someUserRole);
        Optional<LoginUser> userOptional = Optional.of(loginUser);
        Optional<LoginUserHasRole> userHasRole = Optional.of(new LoginUserHasRole(1L, loginUser, userRoles));

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(userOptional);

        when(userHasRoleRepository.findOne(any(Example.class)))
                .thenReturn(userHasRole);

        assertFalse(authorizationService.userHasPermission("user", "aPermission"));
    }

    @Test
    public void userHasPermissionShoudReturnFalseWhenUserHasRolesButNoPermissions() {
        LoginUser loginUser = new LoginUser("user", "aPassword");
        UserRole someUserRole = new UserRole(1L, "someRole", Collections.emptyList(), Collections.emptyList());
        List<UserRole> userRoles = Collections.singletonList(someUserRole);
        Optional<LoginUser> userOptional = Optional.of(loginUser);
        Optional<LoginUserHasRole> userHasRole = Optional.of(new LoginUserHasRole(1L, loginUser, userRoles));

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(userOptional);

        when(userHasRoleRepository.findOne(any(Example.class)))
                .thenReturn(userHasRole);

        assertFalse(authorizationService.userHasPermission("user", "aPermission"));
    }

    @Test
    public void userHasPermissionShoudReturnTrueWhenUserHasRoleWithPermissions() {
        LoginUser loginUser = new LoginUser("user", "aPassword");
        Permission desiredPermission = new Permission(1L, "aPermission");
        UserRole desiredUSerRole = new UserRole(1L, "someRole", Collections.singletonList(desiredPermission), Collections.emptyList());
        List<UserRole> userRoles = Collections.singletonList(desiredUSerRole);
        Optional<LoginUser> userOptional = Optional.of(loginUser);
        Optional<LoginUserHasRole> userHasRole = Optional.of(new LoginUserHasRole(1L, loginUser, userRoles));

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(userOptional);

        when(userHasRoleRepository.findOne(any(Example.class)))
                .thenReturn(userHasRole);

        assertTrue(authorizationService.userHasPermission("user", "aPermission"));
    }

    @Test
    public void userHasPermissionShoudReturnTrueWhenUserHasSubRolesWithDesiredPermissions1stLevel() {
        LoginUser loginUser = new LoginUser("user", "aPassword");
        Permission desiredPermission = new Permission(1L, "aPermission");
        UserRole desiredUSerRole = new UserRole(1L, "someRole", Collections.singletonList(desiredPermission), Collections.emptyList());


        Permission somePermission = new Permission(1L, "anotherPermission");
        UserRole someUserRole = new UserRole(1L, "someRole", Collections.singletonList(somePermission),
                Collections.singletonList(desiredUSerRole));
        List<UserRole> userRoles = Collections.singletonList(someUserRole);
        Optional<LoginUser> userOptional = Optional.of(loginUser);
        Optional<LoginUserHasRole> userHasRole = Optional.of(new LoginUserHasRole(1L, loginUser, userRoles));

        when(loginUsersRepository.findOne(any(Example.class)))
                .thenReturn(userOptional);

        when(userHasRoleRepository.findOne(any(Example.class)))
                .thenReturn(userHasRole);

        assertTrue(authorizationService.userHasPermission("user", "aPermission"));
    }
}
