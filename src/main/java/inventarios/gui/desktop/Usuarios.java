/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.gui.desktop;

import inventarios.to.LoginUsers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class Usuarios {

    public static void main(String[] args) {

        List<LoginUsers> aceptedUserList = new ArrayList<>();
        fillInUserList(aceptedUserList);

        LoginWindow login = new LoginWindow(aceptedUserList);
        login.setVisible(true);
    }

    private static void fillInUserList(List<LoginUsers> userList) {
        LoginUsers francisco = new LoginUsers("francisco", "francisco");
        userList.add(francisco);

        LoginUsers oscar = new LoginUsers("oscar", "oscar");
        userList.add(oscar);

        LoginUsers ignacio = new LoginUsers("ignacio", "ignacio");
        userList.add(ignacio);

        LoginUsers marroquin = new LoginUsers("marroquin", "marroquin");
        userList.add(marroquin);

        LoginUsers morales = new LoginUsers("morales", "morales");
        userList.add(morales);

        LoginUsers ballina = new LoginUsers("ballina", "ballina");
        userList.add(ballina);

        LoginUsers erik = new LoginUsers("erik", "erik");
        userList.add(erik);

        LoginUsers david = new LoginUsers("david", "david");
        userList.add(david);

        LoginUsers avila = new LoginUsers("avila", "avila");
        userList.add(avila);

        LoginUsers cruz = new LoginUsers("cruz", "cruz");
        userList.add(cruz);

        LoginUsers rosa = new LoginUsers("rosa", "rosa");
        userList.add(rosa);

        LoginUsers arcos = new LoginUsers("arcos", "arcos");
        userList.add(arcos);

        LoginUsers vazquez = new LoginUsers("vazquez", "vazquez");
        userList.add(vazquez);

        LoginUsers edgar = new LoginUsers("edgar", "edgar");
        userList.add(edgar);

        LoginUsers gomez = new LoginUsers("gomez", "gomez");
        userList.add(gomez);

        LoginUsers fernando = new LoginUsers("fernando", "fernando");
        userList.add(fernando);

        LoginUsers jimenez = new LoginUsers("jimenez", "jimenez");
        userList.add(jimenez);

        LoginUsers yesica = new LoginUsers("yesica", "yesica");
        userList.add(yesica);

        LoginUsers irene = new LoginUsers("irene", "irene");
        userList.add(irene);

        LoginUsers guadalupe = new LoginUsers("guadalupe", "guadalupe");
        userList.add(guadalupe);

        LoginUsers felix = new LoginUsers("felix", "felix");
        userList.add(felix);

        LoginUsers hernandez = new LoginUsers("hernandez", "hernandez");
        userList.add(hernandez);

        LoginUsers xander = new LoginUsers("xander", "xander");
        userList.add(xander);

        LoginUsers xero = new LoginUsers("xero", "xero");
        userList.add(xero);

        LoginUsers trinidad = new LoginUsers("trinidad", "trinidad");
        userList.add(trinidad);

        LoginUsers montero = new LoginUsers("montero", "montero");
        userList.add(montero);

        LoginUsers aquino = new LoginUsers("aquino", "aquino");
        userList.add(aquino);

        LoginUsers lopez = new LoginUsers("lopez", "lopez");
        userList.add(lopez);

        LoginUsers marriano = new LoginUsers("marriano", "marriano");
        userList.add(marriano);

        LoginUsers miguel = new LoginUsers("miguel", "miguel");
        userList.add(miguel);

        LoginUsers lupita = new LoginUsers("lupita", "lupita");
        userList.add(lupita);

        LoginUsers carlos = new LoginUsers("carlos", "carlos");
        userList.add(carlos);

        LoginUsers alberto = new LoginUsers("alberto", "alberto");
        userList.add(alberto);

        LoginUsers tiburcio = new LoginUsers("tiburcio", "tiburcio");
        userList.add(tiburcio);

        LoginUsers dominga = new LoginUsers("dominga", "dominga");
        userList.add(dominga);

        LoginUsers torres = new LoginUsers("torres", "torres");
        userList.add(torres);

        LoginUsers moreno = new LoginUsers("negro", "blanco");
        userList.add(moreno);

        LoginUsers pedro = new LoginUsers("paco", "chato");
        userList.add(pedro);

        LoginUsers sagrario = new LoginUsers("sagrario", "sagrario");
        userList.add(sagrario);

        LoginUsers heber = new LoginUsers("perry", "rojo");
        userList.add(heber);

        LoginUsers olivera = new LoginUsers("phineas", "ferp");
        userList.add(olivera);

        LoginUsers javier = new LoginUsers("javi", "javi");
        userList.add(javier);

        LoginUsers josua = new LoginUsers("josua", "josua");
        userList.add(josua);

        LoginUsers luis = new LoginUsers("luis", "luis");
        userList.add(luis);
    }

}
