/* 
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.service;

import inventarios.to.LoginUser;
import java.util.logging.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class LoginUsersService {

    private static final Logger log = Logger.getLogger(LoginUsersService.class.getName());
    private RestTemplate restTemplate;
    
    private LoginUser currentUser;

    @Autowired
    public LoginUsersService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean authenticate(LoginUser user) {
        log.log(Level.FINE, "Usuario: {0}", user);
        try {
            Boolean authenticated = restTemplate.postForObject("http://localhost:8080/login", user, Boolean.class);
            log.log(Level.INFO, "Authenticated:{0}", authenticated);
            if(authenticated){
                currentUser = user;
            }
            return authenticated;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean saveNewLoginUser(LoginUser user){
        LoginUser saved = restTemplate.postForObject("http://localhost:8080/users", user, LoginUser.class);
        return null == saved;
    }
    
    // TODO public boolean userHasPermission(Permission p)
}
