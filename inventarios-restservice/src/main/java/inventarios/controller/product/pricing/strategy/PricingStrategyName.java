package inventarios.controller.product.pricing.strategy;

public enum PricingStrategyName {

    COST_BASED_PRICING("COST_BASED_PRICING"),
    COMPETITION_BASED_PRICING("COMPETITION_BASED_PRICING"),
    VALUE_BASED_PRICING("VALUE_BASED_PRICING");
    private String name;

    PricingStrategyName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
