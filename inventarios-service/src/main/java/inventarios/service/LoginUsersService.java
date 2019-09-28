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

import inventarios.repository.LoginUsersRepository;
import inventarios.to.LoginUser;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class LoginUsersService {
    private static final Logger log = Logger.getLogger(LoginUsersService.class.getName());
    private final LoginUsersRepository usersRepository;

    public LoginUsersService(LoginUsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<LoginUser> findAll() {
        return usersRepository.findAll();
    }

    public boolean login(LoginUser user) { //TODO perhaps make final but need workaround for mockito
        log.log(Level.INFO, "authenticating user: {0}", user);
        return usersRepository
                .findOne(Example.of(user))
                .map(LoginUser::isActive)
                .orElse(Boolean.FALSE);
    }

    @Transactional
    public <S extends LoginUser> S save(S entity) {
        entity.setActive(true); // activate newly created users by default
        return usersRepository.save(entity);
    }
}
