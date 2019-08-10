/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author francisco
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//   @GraphQLQuery(name = "id", description = "El identificador de producto")
    private Long id;

    String dateIn;

    String dateOut;

    String name;

    String quantity;

    String characteristics;

    String serial;
//    String size;
//
//    String color;
//
//    String figura;
//
//    String variedad;
//
//    String cosas;
//
//    String descripcion;
//
//    String precio;
//
//    String moneda;
//
//    String calidad;

//    String vistobueno;
//
//    String cosa;
//
//    String bueno;
//
//    String malo;
//
//    String regular;
//
//    String sabor;
//
//    String creado;
//
//    String ensamblado;
//
//    String facturado;
//
//    String compra;

//    String venta;
//
//    String domicilio;
//
//    String estado;
//
//    String Ciudad;
//
//    String Municipio;
//
//    String Pueblo;

    public Product(String name, String quantity, String characteristics, String serial, String dateIn, String dateOut) {
        this.name = name;
        this.quantity = quantity;
        this.characteristics = characteristics;
        this.serial = serial;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }
}
