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
import inventarios.repository.ProductPriceRepository;
import inventarios.repository.ProductRepository;
import inventarios.repository.ProviderRepository;
import inventarios.repository.PurchaseRepository;
import inventarios.repository.SalesRepository;
import inventarios.repository.StorageCostRepository;
import inventarios.repository.StorageRepository;
import inventarios.repository.authorization.PermissionRepository;
import inventarios.repository.authorization.RoleRepository;
import inventarios.repository.authorization.UserHasRoleRepository;
import inventarios.to.EmployeeDetail;
import inventarios.to.LoginUser;
import inventarios.to.OrderDetail;
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import inventarios.to.ProductPrice;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import inventarios.to.Sale;
import inventarios.to.StorageLocation;
import inventarios.to.StorageLocationCost;
import inventarios.to.authorization.LoginUserHasRole;
import inventarios.to.authorization.Permission;
import inventarios.to.authorization.UserRole;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.ArrayList;
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
    private StorageCostRepository storageCostRepository;

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

    @Autowired
    private SalesRepository salesRepository;

    @Autowired
    private ProductPriceRepository productPriceRepository;
    
    @Override
    @Transactional
    public void run(String... args) {

        Permission viewAdminMenu = permissionRepository.save(new Permission(null, "AdminMenu"));

        Permission addNewSystemUser = permissionRepository.save(new Permission(null, "AddUser"));
        Permission approveNewSystemUser = permissionRepository.save(new Permission(null, "AproveUserCreation"));
        Permission deactivateUser = permissionRepository.save(new Permission(null, "DeactivateUser"));

        Permission receiveMerchandise = permissionRepository.save(new Permission(null, "AcceptMerchandise"));

        Permission acceptOrder = permissionRepository.save(new Permission(null, "ApproveRequisition"));
        Permission viewKietchenInventory = permissionRepository.save(new Permission(null, "ViewKitchenInventory"));

        Permission viewMoney = permissionRepository.save(new Permission(null, "ViewMoney"));

        Permission getStatistics = permissionRepository.save(new Permission(null, "GetStatistics"));

        UserRole waiterRole = roleRepository.save(new UserRole(null, "Waiter", Collections.emptyList(), null));
        UserRole cookerRole = roleRepository.save(new UserRole(null, "Cooker", Arrays.asList(viewKietchenInventory, receiveMerchandise), null));
        UserRole accountant = roleRepository.save(new UserRole(null, "Accountant", Arrays.asList(viewMoney, viewKietchenInventory), null));
        UserRole manager = roleRepository.save(new UserRole(null, "Manager", Arrays.asList(addNewSystemUser, deactivateUser), null));
        UserRole adminRole = roleRepository.save(new UserRole(null, "Admin", Arrays.asList(viewAdminMenu, acceptOrder, addNewSystemUser, approveNewSystemUser, getStatistics, deactivateUser, receiveMerchandise), null));

        LoginUser francisco = usersRepository.save(new LoginUser("francisco", "francisco"));

        userHasRoleRepository.save(new LoginUserHasRole(null, francisco, Collections.singletonList(waiterRole)));

        EmployeeDetail seanDetails = new EmployeeDetail(null, "4165465465", "sean", "herbert", "collins", "some addrees #2324", "manager", "08:45 AM", "5:45 PM");
        employeeRepository.save(seanDetails);

        LoginUser sean = usersRepository.save(new LoginUser(null, "sean", "sean", seanDetails, true));
        
        userHasRoleRepository.save(new LoginUserHasRole(null, sean, Collections.singletonList(manager)));

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

        Provider provider1 = new Provider(null, "cervecería", "puebla", "moctezuma", "415646", "246522161", "moctezuma@moctezuma.com", "90153");
        providerRepository.save(provider1);
        Provider provider2 = new Provider(null, "vinos y licores", "tlaxcala ocotlan", "magadan", "124124", "37456", "magadan@magadan.com", "90100");
        providerRepository.save(provider2);

        StorageLocationCost gratis = new StorageLocationCost(null, 0.0);
        storageCostRepository.save(gratis);
        StorageLocationCost rentAmount2019 = new StorageLocationCost(null, 8000.0); //monthly
        storageCostRepository.save(rentAmount2019);
        StorageLocation warehouse1 = new StorageLocation(null, "my warehouse", "my state", "my city", rentAmount2019);
        storageRepository.save(warehouse1);
        StorageLocation kitchen = new StorageLocation(null, "my kitchen", "my state", "my city", rentAmount2019);
        storageRepository.save(kitchen);
        StorageLocation myHouse = new StorageLocation(null, "my kitchen", "my state", "my city", gratis);
        storageRepository.save(myHouse);

        ProductCharacteristic tableCharacteristics = productDetailsRepository.save(new ProductCharacteristic(null, seanDetails, warehouse1, 45.23, "round", "black", "4 people", "good"));
        Product table = new Product("mesa", 2, "1242552", Date.from(Instant.now()), Date.from(Instant.now().plusMillis(2983)), tableCharacteristics);
        productRepository.save(table);

        List<Product> productList1 = Arrays.asList(table);
        OrderDetail initialStuff = new OrderDetail(null, "0001", productList1, seanDetails, Date.from(Instant.now().minusSeconds(2500)));
        orderRepository.save(initialStuff);
        purchaseRepository.save(new Purchase(null, Date.from(Instant.now()), provider1, productList1, initialStuff));
        
        ProductCharacteristic cervezaCharacteristics = productDetailsRepository.save(new ProductCharacteristic(null, seanDetails, warehouse1, 2500.5, "cartoon", "brown", "12", "good"));
        Product cervezaSemana1 = productRepository.save(new Product("cerveza", 25, "1231", new Date(), new Date(), cervezaCharacteristics));
        List<Product> productList2 = Arrays.asList(cervezaSemana1);
        OrderDetail week1Beers = new OrderDetail(null, "0002", productList2, seanDetails, Date.from(Instant.now().minusSeconds(2500)));
        orderRepository.save(week1Beers);
        purchaseRepository.save(new Purchase(null, Date.from(Instant.now()), provider1, productList2, week1Beers));
        
        List<ProductPrice> productPrices = new ArrayList<>();
        ProductPrice precioVentaCervezaSemana1 = productPriceRepository.save(new ProductPrice(null, cervezaSemana1, 25.2, new Date()));
        
        productPrices.add(precioVentaCervezaSemana1);
        salesRepository.save(new Sale(null, productPrices));
    }

}
