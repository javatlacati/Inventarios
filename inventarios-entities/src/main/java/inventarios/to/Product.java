/* 
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import lombok.EqualsAndHashCode;

/**
 * @author francisco
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product implements Serializable {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
//   @GraphQLQuery(name = "id", description = "El identificador de producto")
    private Long id;

    @NotNull(message = "{productdatein.notempty}")
    private Date dateIn;

    @NotNull
    private Date dateOut;

    @NotEmpty(message = "{productname.notempty}")
    private String name;

    @NotNull
    private Integer quantity;

    @NotEmpty(message = "{productserial.notempty}")
    private String serial;

    @OneToOne
    private ProductCharacteristic characteristics;

    public Product(String name, Integer quantity, String serial, Date dateIn, Date dateOut, ProductCharacteristic characteristics) {
        this.name = name;
        this.quantity = quantity;
        this.serial = serial;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.characteristics = characteristics;
    }
}
