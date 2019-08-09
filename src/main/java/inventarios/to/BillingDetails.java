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
 * @author Personal
 */
@AllArgsConstructor
@Setter
@Getter
public class BillingDetails {
    String RFC;
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
