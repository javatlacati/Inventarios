/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import inventarios.to.EmployeeDetail;
import inventarios.to.LoginUser;
import inventarios.to.OrderDetail;
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import inventarios.to.StorageLocation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Oscar
 */
@Component
@AllArgsConstructor
public class DataProvider implements CommandLineRunner {

    @Autowired
    LoginUsersRepository usersRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProviderRepository providerRepository;

    @Autowired
    PurchaseRepository purchaseRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    StorageRepository storageRepository;

    @Autowired
    ProductDetailsRepository productDetailsRepository;
    
    @Autowired
    OrderRepository orderRepository;

    @Override
    @Transactional
    public void run(String... args) {
        usersRepository.save(new LoginUser("francisco", "francisco"));
        EmployeeDetail sean = new EmployeeDetail(null, "4165465465", "sean", "herbert", "collins", "some addrees #2324", "manager", LocalDateTime.now().toString(), LocalDateTime.now().plusHours(8).toString());
        employeeRepository.save(sean);
        usersRepository.save(new LoginUser("oscar", "oscar"));
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
