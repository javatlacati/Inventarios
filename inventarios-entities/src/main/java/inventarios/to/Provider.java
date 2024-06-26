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

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "{providername.notempty}")
    @GraphQLQuery(name = "name", description = "The provider name")
    private String name;
    private String address;
    private String lastName;
    private String number;
    @Digits(integer = 10, fraction = 0, message = "{providerphone.pattern}")
    private String telephoneNumber;
    @Email
    @GraphQLQuery(name = "email", description = "The provider email")
    private String email;
    @Digits(integer = 5, fraction = 0, message = "{providerpobox.pattern}")
    private String poBox;

//    String lugar;
//    String domicilio;
//    String fecha;
//    String addres1;
//    String comunidad;
//    String state;
//    String rfc;
//    String data;
//    String comunidades;
//
}
