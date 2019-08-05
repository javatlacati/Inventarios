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
public class Order {
    String name;
    String lastName;
    String Producto;
    String Empleado;
    String id;
    String RFC;
    String telephone;
    String Direccion;
    String orderDate;
    String localNumber;
    String entity;
    String places;
    
    /*
    Se crea el constructor de la clase
    */
    public Order(String name, String lastName, String Producto, String Empleado, String id, String RFC, String telephone, String Direccion, String orderDate) {
        this.name = name;
        this.lastName = lastName;
        this.Producto = Producto;
        this.Empleado = Empleado;
        this.id = id;
        this.RFC = RFC;
        this.telephone = telephone;
        this.Direccion = Direccion;
        this.orderDate = orderDate;
    }
    
}
