package inventarios.controller.competition;

import inventarios.service.competition.CompetitorService;
import inventarios.to.competition.Competitor;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompetitorController {
    @Autowired
    private CompetitorService competitorService;

    @ApiOperation(value = "retrieves all competitors")
    @GetMapping("/competitors")
    public List<Competitor> findAll() {
        return competitorService.findAll();
    }
}
