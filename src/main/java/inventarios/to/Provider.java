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

/**
 *
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;
    String address;
    String lastName;
    String number;
    String telephoneNumber;
    String email;
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
