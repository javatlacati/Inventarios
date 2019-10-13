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
package inventarios.service.authorization;

import inventarios.repository.LoginUsersRepository;
import inventarios.repository.authorization.PermissionRepository;
import inventarios.repository.authorization.RoleRepository;
import inventarios.repository.authorization.UserHasRoleRepository;
import inventarios.to.LoginUser;
import inventarios.to.authorization.LoginUserHasRole;
import inventarios.to.authorization.Permission;
import inventarios.to.authorization.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.springframework.data.domain.Example.of;

/**
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Service
public class AuthorizationService {

    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;
    private final LoginUsersRepository loginUsersRepository;
    private final UserHasRoleRepository userHasRoleRepository;

    @Autowired
    public AuthorizationService(RoleRepository roleRepository, PermissionRepository permissionRepository, LoginUsersRepository loginUsersRepository, UserHasRoleRepository userHasRoleRepository) {
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
        this.loginUsersRepository = loginUsersRepository;
        this.userHasRoleRepository = userHasRoleRepository;
    }

    public boolean userHasPermission(String userName, String permissionName) {
        Optional<LoginUser> user = loginUsersRepository.findOne(of(new LoginUser(userName, null)));

        Optional<LoginUserHasRole> loginUserHasRole = user.flatMap(theUser -> {
            final LoginUserHasRole targetUserRoleAssociation = new LoginUserHasRole();
            targetUserRoleAssociation.setUser(theUser);
            return userHasRoleRepository.findOne(of(targetUserRoleAssociation));
        });
        Optional<List<UserRole>> userRoles = loginUserHasRole
                .map(LoginUserHasRole::getRoles);
        Optional<Stream<UserRole>> userRoleStream = userRoles
                .map(Collection::stream);

        Optional<Stream<UserRole>> userSubRoles1stLevel = userRoles
                .map(Collection::stream)
                .map(aUserRoleStream -> aUserRoleStream
                        .flatMap(userRole1 ->
                                Optional
                                        .ofNullable(userRole1.getSubRoles())
                                        .map(List::stream)
                                        .orElse(Stream.empty())
                        )
                );


        return Optional.ofNullable(Stream.concat(userRoleStream.orElse(Stream.empty()), userSubRoles1stLevel.orElse(Stream.empty())))
                .map(roleStream -> roleStream.flatMap(userRole -> userRole.getPermissions().stream()))
                .map(permissionsStream -> permissionsStream.map(Permission::getName))
                .map(permissionNameStream -> permissionNameStream
                        .anyMatch(thePermissionName -> thePermissionName.equals(permissionName))
                )
                .orElse(false);

    }

}
