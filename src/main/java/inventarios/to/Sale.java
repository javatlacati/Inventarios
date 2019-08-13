package inventarios.to;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Map;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Sale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany
    List<ProductPrice> productPrices;
}
