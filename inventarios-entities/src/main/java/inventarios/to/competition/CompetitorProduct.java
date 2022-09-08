package inventarios.to.competition;

import inventarios.to.Product;
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
import javax.persistence.OneToOne;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CompetitorProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @OneToOne
    Product ourEquivalent;
    double price;
}
