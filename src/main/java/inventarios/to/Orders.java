/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
public class Orders {
    String Nombre;
    String Apellidos;
    String Producto;
    String Empleado;
    String NumPedido;
    String RFC;
    String Telefono;
    String Direccion;
    String Fecha;
    String numerolocal;
    String  entidad;
    String  lugares;
    
    /*
    Se crea el constructor de la clase
    */
    public Orders(String Nombre, String Apellidos, String Producto, String Empleado, String NumPedido, String RFC, String Telefono,String Direccion,String Fecha) {
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
    
}
