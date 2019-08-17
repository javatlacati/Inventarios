package inventarios.controller;

import inventarios.service.LoginUsersService;
import inventarios.to.LoginUser;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class SimpleAuthenticationController {

    private static LoginUsersService loginUsersService;

    @Autowired
    public SimpleAuthenticationController(LoginUsersService loginUsersService) {
        this.loginUsersService = loginUsersService;
    }

    @PostMapping("/login")
    public boolean hasAccess(@RequestBody LoginUser user) {
        log.fine("User: "+user);
        return loginUsersService.login(user);
    }
}
