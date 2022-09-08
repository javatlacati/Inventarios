package inventarios.controller.product.pricing.strategy;

import inventarios.service.competition.CompetitorProductService;
import inventarios.to.competition.CompetitorProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;

// focuses on competition prices and costs
// occurs to products that are a commodity
@Component
public class CompetitionBasedPricing implements PricingStrategy {
    @Autowired
    CompetitorProductService competitorProductService;

    @Override
    public double getMinimumPrice(String productName) {
        return competitorProductService
                .findAll()
                .stream()
                .filter(competitorProduct -> productName.equalsIgnoreCase(competitorProduct.getOurEquivalent().getName()))
                .min(Comparator.comparing(CompetitorProduct::getPrice))
                .map(CompetitorProduct::getPrice)
                .orElse(0.0d);
    }

    @Override
    public PricingStrategyName getStrategyName() {
        return PricingStrategyName.COMPETITION_BASED_PRICING;
    }
}
