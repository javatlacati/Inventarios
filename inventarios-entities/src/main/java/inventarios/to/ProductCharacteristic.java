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

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductCharacteristic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private EmployeeDetail encargadoregistro;
    @OneToOne
    private StorageLocation location;

    private Double monetaryValue;
    private String shape;
    private String color;
    private String size;
//    String cosas;
//    String variedad;
//    String descripcion;
//    String precio;
//    String moneda;
    private String quality;
//    String vistobueno;
//    String cosa;
//    String bueno;
//    String malo;
//    String regular;
//    String sabor;
//    String creado;
//    String ensamblado;
//    String facturado;
//    String compra;
//    String venta;
}
