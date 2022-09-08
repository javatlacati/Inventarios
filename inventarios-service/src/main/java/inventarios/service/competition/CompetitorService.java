package inventarios.service.competition;

import inventarios.repository.competition.CompetitorRepository;
import inventarios.to.competition.Competitor;
import inventarios.to.competition.CompetitorProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitorService {
    private final CompetitorRepository competitorRepository;

    public CompetitorService(CompetitorRepository competitorRepository) {
        this.competitorRepository = competitorRepository;
    }

    public List<Competitor> findAll() {
        return competitorRepository.findAll();
    }
}
