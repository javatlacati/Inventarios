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
package inventarios.util;

import inventarios.repository.EmployeeRepository;
import inventarios.repository.LoginUsersRepository;
import inventarios.repository.OrderRepository;
import inventarios.repository.ProductDetailsRepository;
import inventarios.repository.ProductRepository;
import inventarios.repository.ProviderRepository;
import inventarios.repository.PurchaseRepository;
import inventarios.repository.StorageRepository;
import inventarios.repository.authorization.PermissionRepository;
import inventarios.repository.authorization.RoleRepository;
import inventarios.repository.authorization.UserHasRoleRepository;
import inventarios.to.EmployeeDetail;
import inventarios.to.LoginUser;
import inventarios.to.OrderDetail;
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import inventarios.to.StorageLocation;
import inventarios.to.authorization.LoginUserHasRole;
import inventarios.to.authorization.Permission;
import inventarios.to.authorization.UserRole;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Oscar
 */
@Component
@AllArgsConstructor
public class DataProvider implements CommandLineRunner {

    @Autowired
    private LoginUsersRepository usersRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private StorageRepository storageRepository;

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private UserHasRoleRepository userHasRoleRepository;

    @Override
    @Transactional
    public void run(String... args) {

        Permission viewAdminMenu = permissionRepository.save(new Permission(null, "AdminMenu"));

        UserRole employeeRole = roleRepository.save(new UserRole(null, "Employee", Collections.emptyList(), null));
        UserRole adminRole = roleRepository.save(new UserRole(null, "Admin", Collections.singletonList(viewAdminMenu), null));

        LoginUser francisco = usersRepository.save(new LoginUser("francisco", "francisco"));

        LoginUserHasRole franciscoEmployee = userHasRoleRepository.save(new LoginUserHasRole(null, francisco, Collections.singletonList(employeeRole)));


        EmployeeDetail sean = new EmployeeDetail(null, "4165465465", "sean", "herbert", "collins", "some addrees #2324", "manager", "08:45 AM", "5:45 PM");
        employeeRepository.save(sean);
        LoginUser oscar = usersRepository.save(new LoginUser("oscar", "oscar"));

        userHasRoleRepository.save(new LoginUserHasRole(null, oscar, Collections.singletonList(adminRole)));
        usersRepository.save(new LoginUser("ignacio", "ignacio"));
        usersRepository.save(new LoginUser("marroquin", "marroquin"));
        usersRepository.save(new LoginUser("morales", "morales"));
        usersRepository.save(new LoginUser("ballina", "ballina"));
        usersRepository.save(new LoginUser("erik", "erik"));
        usersRepository.save(new LoginUser("david", "david"));
        usersRepository.save(new LoginUser("avila", "avila"));
        usersRepository.save(new LoginUser("cruz", "cruz"));
        usersRepository.save(new LoginUser("rosa", "rosa"));
        usersRepository.save(new LoginUser("arcos", "arcos"));
        usersRepository.save(new LoginUser("vazquez", "vazquez"));
        usersRepository.save(new LoginUser("edgar", "edgar"));
        usersRepository.save(new LoginUser("gomez", "gomez"));
        usersRepository.save(new LoginUser("xander", "xander"));
        usersRepository.save(new LoginUser("xero", "xero"));
        usersRepository.save(new LoginUser("trinidad", "trinidad"));
        usersRepository.save(new LoginUser("montero", "montero"));
        usersRepository.save(new LoginUser("aquino", "aquino"));
        usersRepository.save(new LoginUser("lopez", "lopez"));
        usersRepository.save(new LoginUser("marriano", "marriano"));
        usersRepository.save(new LoginUser("miguel", "miguel"));
        usersRepository.save(new LoginUser("lupita", "lupita"));

        Provider provider1 = new Provider(null, "cervecería moctezuma", "puebla", "", "415646", "246522161", "moctezuma@moctezuma.com", "90153");
        providerRepository.save(provider1);

        StorageLocation warehouse1 = new StorageLocation(null, "my warehouse", "my state", "my city");
        storageRepository.save(warehouse1);
        ProductCharacteristic tableCharacteristics = new ProductCharacteristic(null, sean, warehouse1, 45.23, "round", "black", "4 people", "good");
        productDetailsRepository.save(tableCharacteristics);
        Product table = new Product("mesa", 2, "1242552", Date.from(Instant.now()), Date.from(Instant.now().plusMillis(2983)), tableCharacteristics);
        productRepository.save(table);

        List<Product> productList1 = Arrays.asList(table);
        OrderDetail requestingOrder = new OrderDetail(null, "0001", productList1, sean, Date.from(Instant.now().minusSeconds(2500)));
        orderRepository.save(requestingOrder);
        purchaseRepository.save(new Purchase(null, Date.from(Instant.now()), provider1, productList1, requestingOrder));
    }

    private static void fillInUserList(List<LoginUser> userList) {

//        LoginUser fernando = new LoginUser(null, "fernando", "fernando");
//        userList.add(fernando);
//
//        LoginUser jimenez = new LoginUser(null, "jimenez", "jimenez");
//        userList.add(jimenez);
//
//        LoginUser yesica = new LoginUser(null, "yesica", "yesica");
//        userList.add(yesica);
//
//        LoginUser irene = new LoginUser(null, "irene", "irene");
//        userList.add(irene);
//
//        LoginUser guadalupe = new LoginUser(null, "guadalupe", "guadalupe");
//        userList.add(guadalupe);
//
//        LoginUser felix = new LoginUser(null, "felix", "felix");
//        userList.add(felix);
//
//        LoginUser hernandez = new LoginUser(null, "hernandez", "hernandez");
//        userList.add(hernandez);
//
//        LoginUser carlos = new LoginUser("carlos", "carlos");
//        userList.add(carlos);
//
//        LoginUser alberto = new LoginUser("alberto", "alberto");
//        userList.add(alberto);
//
//        LoginUser tiburcio = new LoginUser("tiburcio", "tiburcio");
//        userList.add(tiburcio);
//
//        LoginUser dominga = new LoginUser("dominga", "dominga");
//        userList.add(dominga);
//
//        LoginUser torres = new LoginUser("torres", "torres");
//        userList.add(torres);
//
//        LoginUser moreno = new LoginUser("negro", "blanco");
//        userList.add(moreno);
//
//        LoginUser pedro = new LoginUser("paco", "chato");
//        userList.add(pedro);
//
//        LoginUser sagrario = new LoginUser("sagrario", "sagrario");
//        userList.add(sagrario);
//
//        LoginUser heber = new LoginUser("perry", "rojo");
//        userList.add(heber);
//
//        LoginUser olivera = new LoginUser("phineas", "ferp");
//        userList.add(olivera);
//
//        LoginUser javier = new LoginUser("javi", "javi");
//        userList.add(javier);
//
//        LoginUser josua = new LoginUser("josua", "josua");
//        userList.add(josua);
//
//        LoginUser luis = new LoginUser("luis", "luis");
//        userList.add(luis);
    }

}
