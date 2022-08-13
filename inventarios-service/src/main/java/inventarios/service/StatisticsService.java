package inventarios.service;

import inventarios.to.StorageLocation;
import inventarios.to.StorageLocationCost;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.DoubleSummaryStatistics;

public class StatisticsService {
    @Autowired
    private StorageService storageService;

    public DoubleSummaryStatistics storageStatistics() {
        return storageService.findAll()
                .stream()
                .map(StorageLocation::getCost)
                .mapToDouble(StorageLocationCost::getMontlyCost)
                .summaryStatistics();
    }
}
