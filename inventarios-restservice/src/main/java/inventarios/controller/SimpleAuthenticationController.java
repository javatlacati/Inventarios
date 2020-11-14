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
package inventarios.controller;

import inventarios.service.LoginUsersService;
import inventarios.to.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class SimpleAuthenticationController {

    private static final Logger log = Logger.getLogger(SimpleAuthenticationController.class.getName());
    private LoginUsersService loginUsersService;

    @Autowired
    public SimpleAuthenticationController(LoginUsersService loginUsersService) {
        this.loginUsersService = loginUsersService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public boolean hasAccess(@RequestBody LoginUser user) {
        log.log(Level.FINE, "User: {0}", user);
        return loginUsersService.login(user);
    }
}
