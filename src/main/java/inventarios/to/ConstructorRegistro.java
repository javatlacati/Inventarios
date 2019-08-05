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
 * @author david
 */
@AllArgsConstructor
@Setter
@Getter
public class ConstructorRegistro {
    String producto;
    String fecharegistro;
    String lugarresgistro;
    String monetaryValue;
    String encargadoregistro;

}
