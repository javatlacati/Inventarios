package inventarios.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class StorageLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String locationName;
    String state;
    String city;
//    String Municipio;
//    String Pueblo;
}
