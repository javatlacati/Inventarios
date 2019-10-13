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
package inventarios.service.restclient;

import inventarios.to.LoginUser;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Service
@Log
public class AuthorizationService {

    private LoginUsersService loginUsersService;
    private RestTemplate restTemplate;

    @Autowired
    public AuthorizationService(LoginUsersService loginUsersService, RestTemplate restTemplate) {
        this.loginUsersService = loginUsersService;
        this.restTemplate = restTemplate;
    }

    public boolean userHasPermission(String PermissionName) {
        log.log(Level.FINE, "Checking for permission: {0}", PermissionName);
        LoginUser currentUser = loginUsersService.getCurrentUser();
        log.log(Level.FINE, "Usuario: {0}", currentUser);
        try {
            Boolean hasPermission = restTemplate.postForObject("http://localhost:8080/authorize", new String[]{currentUser.getUserName(), PermissionName}, Boolean.class);
            log.log(Level.INFO, "Has :{0}", hasPermission);
            return hasPermission;
        } catch (NullPointerException e) {
            log.log(Level.FINER, "Null object received", e);
            return false;
        }
    }

}
