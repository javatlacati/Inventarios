/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author EfraJiJim
 */
public class Proveedor {
    /*
    Se cran los atributos
    */
    String Nombre;
    String Direccion;
    String Apellidos;
    String Num;
    String Telefono;
    String Mail;
    String CodPost;
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
