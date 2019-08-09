/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;
    String lastName;
    String Producto;
    String Empleado;
    String number;
    String rfc;
    String telephone;
    String address;
    String orderDate;
//    String localNumber;
//    String entity;
//    String places;
    
}
