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
public class Pedidos {
    /*
    Se agregan los atributos
    */
    String Nombre;
    String Apellidos;
    String Producto;
    String Empleado;
    String NumPedido;
    String RFC;
    String Telefono;
    String Direccion;
    String Fecha;

    public Pedidos(String Nombre, String Apellidos, String Producto, String Empleado, String NumPedido, String RFC, String Telefono, String numerolocal, String entidad, String lugares,String Direccion,String Fecha) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Producto = Producto;
        this.Empleado = Empleado;
        this.NumPedido = NumPedido;
        this.RFC = RFC;
        this.Telefono = Telefono;
        this.numerolocal = numerolocal;
        this.entidad = entidad;
        this.lugares = lugares;
        this.Direccion = Direccion;
        this.Fecha = Fecha;
    }
    String numerolocal;
    String  entidad;
    String  lugares;
    
    /*
    Se crea el constructor de la clase
    */
    public Pedidos(String Nombre, String Apellidos, String Producto, String Empleado, String NumPedido, String RFC, String Telefono,String Direccion,String Fecha) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Producto = Producto;
        this.Empleado = Empleado;
        this.NumPedido = NumPedido;
        this.RFC = RFC;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Fecha = Fecha;
    }
    
    /*
    Se crea los get's and set's
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

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public String getNumPedido() {
        return NumPedido;
    }

    public void setNumPedido(String NumPedido) {
        this.NumPedido = NumPedido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    public String  getDireccion() {
        return Direccion;
    }
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
        
    }
    
    public String getFecha() {
        return Fecha;
    }
    
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    
}
