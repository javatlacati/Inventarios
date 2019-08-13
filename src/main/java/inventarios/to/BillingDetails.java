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
 * @author Personal
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class BillingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String rfc;
    String RS;
    String streetName;
    String NE;
    String NI;
    String Colonia;
    String Localidad;
    String DM;
    String state;
    String country;
    String poBox;
    String EM;
}
