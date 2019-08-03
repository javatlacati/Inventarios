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
public class Compras {
    /*
    Se agregan los atributos 
    */
    String Fecha;
    String Proveedor;
    String Direccion;    
    String Telefono;
    String Mail;
    String Producto;
    String RFC;
    /*
    Se crea el constructor de la clase
    */
    public Compras(String Fecha, String Proveedor, String Direccion, String Telefono, String Mail, String Producto, String RFC) {
        this.Fecha = Fecha;
        this.Proveedor = Proveedor;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Mail = Mail;
        this.Producto = Producto;
        this.RFC = RFC;
    }
    /*
    Se crean los get y set
    */
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
}
