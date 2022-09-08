package inventarios.controller.product.pricing.strategy;

import inventarios.service.ProductService;
import inventarios.service.ProviderService;
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;

// focuses en the cost of production to determine a product
// increaces profit by increasing quantity
// simple
// ignores customer perceptions
@Component
public class CostBasedPricing implements PricingStrategy{
    @Autowired
    private ProductService productService;
    @Override
    public double getMinimumPrice(String productName) {
        return productService.findAll()
                .stream()
                .filter(product -> productName.equalsIgnoreCase(product.getName()))
                .map(Product::getCharacteristics)
                .min(Comparator.comparing(ProductCharacteristic::getMonetaryValue))
                .map(ProductCharacteristic::getMonetaryValue)
                .orElse(0.0d);
    }

    @Override
    public PricingStrategyName getStrategyName() {
        return PricingStrategyName.COST_BASED_PRICING;
    }
}
