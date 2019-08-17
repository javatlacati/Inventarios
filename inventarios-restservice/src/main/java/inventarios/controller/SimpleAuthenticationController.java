package inventarios.controller;

import inventarios.service.LoginUsersService;
import inventarios.to.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAuthenticationController {

    private static LoginUsersService loginUsersService;

    @Autowired
    public SimpleAuthenticationController(LoginUsersService loginUsersService) {
        this.loginUsersService = loginUsersService;
    }

    @PostMapping("/login")
    public boolean hasAccess(LoginUser user) {
        return loginUsersService.login(user);
    }
}
