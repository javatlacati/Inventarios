package inventarios.service.competition;

import inventarios.repository.competition.CompetitorProductRepository;
import inventarios.to.competition.CompetitorProduct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetitorProductService {
    private CompetitorProductRepository competitorProductRepository;

    public CompetitorProductService(CompetitorProductRepository competitorProductRepository) {
        this.competitorProductRepository = competitorProductRepository;
    }

    public List<CompetitorProduct> findAll() {
        return competitorProductRepository.findAll();
    }

    public <S extends CompetitorProduct> S save(S entity) {
        return competitorProductRepository.save(entity);
    }

    public Optional<CompetitorProduct> findById(Long aLong) {
        return competitorProductRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        competitorProductRepository.deleteById(aLong);
    }
}
