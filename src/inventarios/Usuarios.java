/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class Usuarios {

    public static void main(String[] args) {

        List<UsuariosParaInicioSecion> aceptedUserList = new ArrayList<>();
        fillInUserList(aceptedUserList);

        InicioSecionVentana login = new InicioSecionVentana(aceptedUserList);
        login.setVisible(true);
    }

    private static void fillInUserList(List<UsuariosParaInicioSecion> userList) {
        UsuariosParaInicioSecion francisco = new UsuariosParaInicioSecion("francisco", "francisco");
        userList.add(francisco);

        UsuariosParaInicioSecion oscar = new UsuariosParaInicioSecion("oscar", "oscar");
        userList.add(oscar);

        UsuariosParaInicioSecion ignacio = new UsuariosParaInicioSecion("ignacio", "ignacio");
        userList.add(ignacio);

        UsuariosParaInicioSecion marroquin = new UsuariosParaInicioSecion("marroquin", "marroquin");
        userList.add(marroquin);

        UsuariosParaInicioSecion morales = new UsuariosParaInicioSecion("morales", "morales");
        userList.add(morales);

        UsuariosParaInicioSecion ballina = new UsuariosParaInicioSecion("ballina", "ballina");
        userList.add(ballina);

        UsuariosParaInicioSecion erik = new UsuariosParaInicioSecion("erik", "erik");
        userList.add(erik);

        UsuariosParaInicioSecion david = new UsuariosParaInicioSecion("david", "david");
        userList.add(david);

        UsuariosParaInicioSecion avila = new UsuariosParaInicioSecion("avila", "avila");
        userList.add(avila);

        UsuariosParaInicioSecion cruz = new UsuariosParaInicioSecion("cruz", "cruz");
        userList.add(cruz);

        UsuariosParaInicioSecion rosa = new UsuariosParaInicioSecion("rosa", "rosa");
        userList.add(rosa);

        UsuariosParaInicioSecion arcos = new UsuariosParaInicioSecion("arcos", "arcos");
        userList.add(arcos);

        UsuariosParaInicioSecion vazquez = new UsuariosParaInicioSecion("vazquez", "vazquez");
        userList.add(vazquez);

        UsuariosParaInicioSecion edgar = new UsuariosParaInicioSecion("edgar", "edgar");
        userList.add(edgar);

        UsuariosParaInicioSecion gomez = new UsuariosParaInicioSecion("gomez", "gomez");
        userList.add(gomez);

        UsuariosParaInicioSecion fernando = new UsuariosParaInicioSecion("fernando", "fernando");
        userList.add(fernando);

        UsuariosParaInicioSecion jimenez = new UsuariosParaInicioSecion("jimenez", "jimenez");
        userList.add(jimenez);

        UsuariosParaInicioSecion yesica = new UsuariosParaInicioSecion("yesica", "yesica");
        userList.add(yesica);

        UsuariosParaInicioSecion irene = new UsuariosParaInicioSecion("irene", "irene");
        userList.add(irene);

        UsuariosParaInicioSecion guadalupe = new UsuariosParaInicioSecion("guadalupe", "guadalupe");
        userList.add(guadalupe);

        UsuariosParaInicioSecion felix = new UsuariosParaInicioSecion("felix", "felix");
        userList.add(felix);

        UsuariosParaInicioSecion hernandez = new UsuariosParaInicioSecion("hernandez", "hernandez");
        userList.add(hernandez);

        UsuariosParaInicioSecion xander = new UsuariosParaInicioSecion("xander", "xander");
        userList.add(xander);

        UsuariosParaInicioSecion xero = new UsuariosParaInicioSecion("xero", "xero");
        userList.add(xero);

        UsuariosParaInicioSecion trinidad = new UsuariosParaInicioSecion("trinidad", "trinidad");
        userList.add(trinidad);

        UsuariosParaInicioSecion montero = new UsuariosParaInicioSecion("montero", "montero");
        userList.add(montero);

        UsuariosParaInicioSecion aquino = new UsuariosParaInicioSecion("aquino", "aquino");
        userList.add(aquino);

        UsuariosParaInicioSecion lopez = new UsuariosParaInicioSecion("lopez", "lopez");
        userList.add(lopez);

        UsuariosParaInicioSecion marriano = new UsuariosParaInicioSecion("marriano", "marriano");
        userList.add(marriano);

        UsuariosParaInicioSecion miguel = new UsuariosParaInicioSecion("miguel", "miguel");
        userList.add(miguel);

        UsuariosParaInicioSecion lupita = new UsuariosParaInicioSecion("lupita", "lupita");
        userList.add(lupita);

        UsuariosParaInicioSecion carlos = new UsuariosParaInicioSecion("carlos", "carlos");
        userList.add(carlos);

        UsuariosParaInicioSecion alberto = new UsuariosParaInicioSecion("alberto", "alberto");
        userList.add(alberto);

        UsuariosParaInicioSecion tiburcio = new UsuariosParaInicioSecion("tiburcio", "tiburcio");
        userList.add(tiburcio);

        UsuariosParaInicioSecion dominga = new UsuariosParaInicioSecion("dominga", "dominga");
        userList.add(dominga);

        UsuariosParaInicioSecion torres = new UsuariosParaInicioSecion("torres", "torres");
        userList.add(torres);

        UsuariosParaInicioSecion moreno = new UsuariosParaInicioSecion("negro", "blanco");
        userList.add(moreno);

        UsuariosParaInicioSecion pedro = new UsuariosParaInicioSecion("paco", "chato");
        userList.add(pedro);

        UsuariosParaInicioSecion sagrario = new UsuariosParaInicioSecion("sagrario", "sagrario");
        userList.add(sagrario);

        UsuariosParaInicioSecion heber = new UsuariosParaInicioSecion("perry", "rojo");
        userList.add(heber);

        UsuariosParaInicioSecion olivera = new UsuariosParaInicioSecion("phineas", "ferp");
        userList.add(olivera);

        UsuariosParaInicioSecion javier = new UsuariosParaInicioSecion("javi", "javi");
        userList.add(javier);

        UsuariosParaInicioSecion josua = new UsuariosParaInicioSecion("josua", "josua");
        userList.add(josua);

        UsuariosParaInicioSecion luis = new UsuariosParaInicioSecion("luis", "luis");
        userList.add(luis);
    }

}
