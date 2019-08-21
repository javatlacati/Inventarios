package inventarios.service;

import inventarios.to.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class LoginUsersService {

    private static final Logger log = Logger.getLogger(LoginUsersService.class.getName());
    private RestTemplate restTemplate;

    @Autowired
    public LoginUsersService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean authenticate(LoginUser user) {
        log.fine("Usuario: "+user);
        try {
            Boolean aBoolean = restTemplate.postForObject("http://localhost:8080/login", user, Boolean.class);
            log.info("Authenticated:"+aBoolean);
            return aBoolean;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}
