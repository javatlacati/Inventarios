package inventarios.controller;

import inventarios.service.authorization.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class SimpleAuthorizationController {
    private static final Logger log = Logger.getLogger(SimpleAuthorizationController.class.getName());
    private AuthorizationService authorizationService;

    @Autowired
    public SimpleAuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping("/authorize")
    public boolean hasAccess(@RequestBody String[] userPermission) {
        log.log(Level.FINE, "UserPermission: {0}", userPermission);
        if (userPermission.length != 2) {
            return false; //TODO perhaps throw some error here
        }
        return authorizationService.userHasPermission(userPermission[0], userPermission[1]);
    }
}
