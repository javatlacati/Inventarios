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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;

/**
 * @author francisco
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
//   @GraphQLQuery(name = "id", description = "El identificador de producto")
    private Long id;

    @NotNull(message = "{productdatein.notempty}")
    Date dateIn;

    @NotNull
    Date dateOut;

    @NotEmpty(message = "{productname.notempty}")
    String name;

    @NotNull
    Integer quantity;

    @NotEmpty(message = "{productserial.notempty}")
    String serial;

    @OneToOne
    ProductCharacteristic characteristics;

    public Product(String name, Integer quantity, String serial, Date dateIn, Date dateOut, ProductCharacteristic characteristics) {
        this.name = name;
        this.quantity = quantity;
        this.serial = serial;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.characteristics = characteristics;
    }
}
