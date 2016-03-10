/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Usuarios {
    
    public static void main(String[] args) {
        
       
        
        
       ArrayList<UsuariosParaInicioSecion> lista_usuarios = new ArrayList<>();
       //crear user//
       UsuariosParaInicioSecion oscar = new UsuariosParaInicioSecion("oscar", "oscar");
       //agregar a lista//
       lista_usuarios.add(oscar);
       
       UsuariosParaInicioSecion ignacio = new UsuariosParaInicioSecion("ignacio", "ignacio");
       lista_usuarios.add(ignacio);
       
       UsuariosParaInicioSecion marroquin = new UsuariosParaInicioSecion("marroquin", "marroquin");
       lista_usuarios.add(marroquin);
       
       UsuariosParaInicioSecion morales = new UsuariosParaInicioSecion("morales", "morales");
       lista_usuarios.add(morales);
       
        UsuariosParaInicioSecion francisco = new UsuariosParaInicioSecion("francisco", "francisco");
       lista_usuarios.add(francisco);
      
       
       InicioSecionVentana login = new InicioSecionVentana (lista_usuarios);
       login.setVisible(true);
    }
    
}
