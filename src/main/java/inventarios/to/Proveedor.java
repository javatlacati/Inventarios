/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
public class Proveedor {
    /*
    Se cran los atributos
     */
    private static final Logger LOG = Logger.getLogger(Proveedor.class.getName());

    String Nombre;
    String Direccion;
    String Apellidos;
    String Num;
    String Telefono;
    String Mail;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Nombre);
        hash = 53 * hash + Objects.hashCode(this.Direccion);
        hash = 53 * hash + Objects.hashCode(this.Apellidos);
        hash = 53 * hash + Objects.hashCode(this.Num);
        hash = 53 * hash + Objects.hashCode(this.Telefono);
        hash = 53 * hash + Objects.hashCode(this.Mail);
        hash = 53 * hash + Objects.hashCode(this.CodPost);
        hash = 53 * hash + Objects.hashCode(this.lugar);
        hash = 53 * hash + Objects.hashCode(this.domicilio);
        hash = 53 * hash + Objects.hashCode(this.fecha);
        hash = 53 * hash + Objects.hashCode(this.direccion);
        hash = 53 * hash + Objects.hashCode(this.comunidad);
        hash = 53 * hash + Objects.hashCode(this.estado);
        hash = 53 * hash + Objects.hashCode(this.rfc);
        hash = 53 * hash + Objects.hashCode(this.datos);
        hash = 53 * hash + Objects.hashCode(this.comunidades);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Direccion, other.Direccion)) {
            return false;
        }
        if (!Objects.equals(this.Apellidos, other.Apellidos)) {
            return false;
        }
        if (!Objects.equals(this.Num, other.Num)) {
            return false;
        }
        if (!Objects.equals(this.Telefono, other.Telefono)) {
            return false;
        }
        if (!Objects.equals(this.Mail, other.Mail)) {
            return false;
        }
        if (!Objects.equals(this.CodPost, other.CodPost)) {
            return false;
        }
        if (!Objects.equals(this.lugar, other.lugar)) {
            return false;
        }
        if (!Objects.equals(this.domicilio, other.domicilio)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.comunidad, other.comunidad)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.rfc, other.rfc)) {
            return false;
        }
        if (!Objects.equals(this.datos, other.datos)) {
            return false;
        }
        if (!Objects.equals(this.comunidades, other.comunidades)) {
            return false;
        }
        return true;
    }

    public Proveedor(String Nombre, String Direccion, String Num, String Telefono, String Mail, String CodPost, String lugar, String domicilio, String fecha, String direccion, String comunidad, String estado, String rfc, String comunidades) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Num = Num;
        this.Telefono = Telefono;
        this.Mail = Mail;
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
    public Proveedor(String Nombre, String Direccion,String Apellidos, String Num, String Telefono, String Mail, String CodPost) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Apellidos = Apellidos;
        this.Num = Num;
        this.Telefono = Telefono;
        this.Mail = Mail;
        this.CodPost = CodPost;
    }
}
