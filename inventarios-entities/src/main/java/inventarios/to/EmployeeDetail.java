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
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author IDELFONSO
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
public class EmployeeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Enrollment number
     */
    private String number;
    private String name;
    private String middleName;
    private String lastName;
    private String homeAdress;
    private String position;
    private String startTime;
    private String endTime;
}
