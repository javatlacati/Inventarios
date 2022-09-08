package inventarios.controller.product.pricing.strategy;

public interface PricingStrategy {
    double getMinimumPrice(String productName);

    PricingStrategyName getStrategyName();
}
