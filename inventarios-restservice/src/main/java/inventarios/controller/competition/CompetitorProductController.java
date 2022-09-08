package inventarios.controller.competition;

import inventarios.service.competition.CompetitorProductService;
import inventarios.to.competition.CompetitorProduct;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CompetitorProductController {
    @Autowired
    private CompetitorProductService competitorProductService;

    @ApiOperation(value = "retrieves all competitor products")
    @GetMapping("/competitorsProducts")
    public List<CompetitorProduct> findAll() {
        return competitorProductService.findAll();
    }

    @PostMapping("/competitorsProducts")
    public <S extends CompetitorProduct> S save(@RequestBody S entity) {
        return competitorProductService.save(entity);
    }

    @GetMapping("/competitorsProducts/{id}")
    public Optional<CompetitorProduct> findById(@PathVariable Long id) {
        return competitorProductService.findById(id);
    }

    @DeleteMapping("/competitorsProducts/{id}")
    public void deleteById(@PathVariable Long id) {
        competitorProductService.deleteById(id);
    }
}
