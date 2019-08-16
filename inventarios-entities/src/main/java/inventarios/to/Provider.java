/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to;

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
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "{providername.notempty}")
    String name;
    String address;
    String lastName;
    String number;
    @Digits(integer = 10, fraction = 0, message = "{providerphone.pattern}")
    String telephoneNumber;
    @Email
    String email;
    @Digits(integer = 5, fraction = 0, message = "{providerpobox.pattern}")
    String poBox;

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
