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
 * @author IDELFONSO
 */
@AllArgsConstructor
@Setter
@Getter
public class EmployeeDetails {
    
    private String id;
    private String name;
    private String middleName;
    private String lastName;
    private String homeAdress;
    private String position;
    private String startTime;
    private String hours;
            
}
