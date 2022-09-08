package inventarios.repository.competition;

import inventarios.to.competition.CompetitorProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitorProductRepository extends JpaRepository<CompetitorProduct, Long> {
}
