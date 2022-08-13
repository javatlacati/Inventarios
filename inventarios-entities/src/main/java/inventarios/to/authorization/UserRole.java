/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.to.authorization;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//   @GraphQLQuery(name = "id", description = "El identificador de rol")
    private Long id;
    private String name;
    @ManyToMany
    private List<Permission> permissions;
    
    //recursive definition for hierarchichal quering
    @OneToMany
    private List<UserRole> subRoles;
}
