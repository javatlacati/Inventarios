/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.logging.Logger;

/**
 *
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Provider {
    /*
    Se cran los atributos
     */
    private static final Logger LOG = Logger.getLogger(Provider.class.getName());

    String name;
    String Direccion;
    String Apellidos;
    String Num;
    String telephoneNumber;
    String email;
    String CodPost;
    String lugar;
    String domicilio;
    String  fecha;
    String direccion;
    String comunidad;
    String  estado;
    String rfc;
    String datos;
    String comunidades;

    public Provider(String name, String Direccion, String Num, String telephoneNumber, String email, String CodPost, String lugar, String domicilio, String fecha, String direccion, String comunidad, String estado, String rfc, String comunidades) {
        this.name = name;
        this.Direccion = Direccion;
        this.Num = Num;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.CodPost = CodPost;
        this.lugar = lugar;
        this.domicilio = domicilio;
        this.fecha = fecha;
        this.direccion = direccion;
        this.comunidad = comunidad;
        this.estado = estado;
        this.rfc = rfc;
        this.comunidades = comunidades;
    }
    
    
    /*
    Se crea el constructor de la clase
    */
    public Provider(String name, String Direccion, String Apellidos, String Num, String telephoneNumber, String email, String CodPost) {
        this.name = name;
        this.Direccion = Direccion;
        this.Apellidos = Apellidos;
        this.Num = Num;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.CodPost = CodPost;
    }
}
