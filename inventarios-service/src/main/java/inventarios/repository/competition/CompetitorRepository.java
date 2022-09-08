package inventarios.repository.competition;

import inventarios.to.competition.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitorRepository extends JpaRepository<Competitor, Long> {
}
