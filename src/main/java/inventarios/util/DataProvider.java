/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.util;

import inventarios.repository.LoginUsersRepository;
import inventarios.to.LoginUser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Oscar
 */
@Component
@AllArgsConstructor
public class DataProvider implements CommandLineRunner {

    @Autowired
    LoginUsersRepository usersRepository;

    @Override
    @Transactional
    public void run(String... args) {
        usersRepository.save(new LoginUser(null,"francisco", "francisco"));
        usersRepository.save(new LoginUser(null, "oscar", "oscar"));
        usersRepository.save( new LoginUser(null, "ignacio", "ignacio"));
        usersRepository.save( new LoginUser(null, "marroquin", "marroquin"));
        usersRepository.save(new LoginUser(null, "morales", "morales"));
        usersRepository.save(new LoginUser(null, "ballina", "ballina"));
        usersRepository.save(new LoginUser(null, "erik", "erik"));
        usersRepository.save(new LoginUser(null,"david", "david"));
        usersRepository.save(new LoginUser(null,"avila", "avila"));
        usersRepository.save(new LoginUser(null,"cruz", "cruz"));
        usersRepository.save(new LoginUser(null,"rosa", "rosa"));
        usersRepository.save(new LoginUser(null, "arcos", "arcos"));
        usersRepository.save(new LoginUser(null, "vazquez", "vazquez"));
        usersRepository.save(new LoginUser(null, "edgar", "edgar"));
        usersRepository.save(new LoginUser(null, "gomez", "gomez"));
        usersRepository.save(new LoginUser(null, "xander", "xander"));
        usersRepository.save(new LoginUser(null, "xero", "xero"));
        usersRepository.save(new LoginUser(null, "trinidad", "trinidad"));
        usersRepository.save(new LoginUser(null, "montero", "montero"));
        usersRepository.save(new LoginUser(null, "aquino", "aquino"));
        usersRepository.save(new LoginUser(null, "lopez", "lopez"));
        usersRepository.save(new LoginUser(null, "marriano", "marriano"));
        usersRepository.save(new LoginUser(null, "miguel", "miguel"));
        usersRepository.save(new LoginUser(null, "lupita", "lupita"));
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
