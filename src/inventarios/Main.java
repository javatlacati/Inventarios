/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

import java.util.ArrayList;

/**
 *
 * @author francisco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
      * Se instancia el ArrayList para guardar los datos
     */
        ArrayList<UsuariosParaInicioSecion> lista_usuarios = new ArrayList<>();
        /*
        * Se agrega un usuario predeterminado para el inicio de secion 
        */
        UsuariosParaInicioSecion admin = new UsuariosParaInicioSecion("admin", "1234");
        lista_usuarios.add(admin);
        /*
        *  Se instancia el llamado a la ventana desde el main
        */
        InicioSecionVentana login = new InicioSecionVentana(lista_usuarios);
        login.setVisible(true);
        /*
        * Pueden agregar mas codigo si necesita o para agregar ms cosas
        */
    }

}
