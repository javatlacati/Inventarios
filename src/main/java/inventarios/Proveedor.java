/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author EfraJiJim
 */
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
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

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

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public void setComunidades(String comunidades) {
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
    
    /*
    Se agregan los Set's y los Get's
    */
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String Num) {
        this.Num = Num;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCodPost() {
        return CodPost;
    }

    public void setCodPost(String CodPost) {
        this.CodPost = CodPost;
    }

    
    
}
