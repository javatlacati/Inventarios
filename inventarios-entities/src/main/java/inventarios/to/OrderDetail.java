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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String number;
    @OneToMany
    List<Product> products;
    @OneToOne
    EmployeeDetail employee;
    Date orderDate;
//    String localNumber;
//    String entity;
//    String places;
    
}
