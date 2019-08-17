package inventarios.service;

import inventarios.to.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class LoginUsersService {

    private RestTemplate restTemplate;

    @Autowired
    public LoginUsersService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean authenticate(LoginUser user) {
        try {
            return restTemplate.postForObject(new URI("http://localhost:8080/login"), user, Boolean.class);
        } catch (URISyntaxException | NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}
