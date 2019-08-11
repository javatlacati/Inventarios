package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author EfraJiJim
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class LoginUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//   @GraphQLQuery(name = "id", description = "El identificador de usuario")
    private Long id;

    //   @GraphQLQuery(name = "name", description = "El nombre de usuario")
    @NotEmpty(message = "{username.notempty}")
    private String userName;
    @NotEmpty(message = "{password.notempty}")
    private String password;
    private boolean active;


    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
        active = true;
    }
}
