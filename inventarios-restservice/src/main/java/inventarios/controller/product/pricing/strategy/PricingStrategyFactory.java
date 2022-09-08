package inventarios.controller.product.pricing.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class PricingStrategyFactory {
    private Map<String, PricingStrategy> strategies;

    public PricingStrategyFactory(Set<PricingStrategy> strategySet) {
        createStrategy(strategySet);
    }

    private void createStrategy(Set<PricingStrategy> strategySet) {
        strategies = new HashMap<>();
        strategySet.forEach(
                pricingStrategy -> strategies.put(pricingStrategy.getStrategyName().getName(), pricingStrategy)
        );
    }

    public PricingStrategy findByName(String name) {
        return strategies.get(name);
    }
}
