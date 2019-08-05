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
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
public class Purchase {
    String date;
    String Proveedor;
    String address;
    String telephone;
    String email;
    String Producto;
    String rfc;
}
