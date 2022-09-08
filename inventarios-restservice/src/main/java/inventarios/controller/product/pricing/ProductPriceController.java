package inventarios.controller.product.pricing;

import inventarios.controller.product.pricing.strategy.PricingStrategyFactory;
import inventarios.service.ProductPriceService;
import inventarios.to.ProductPrice;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductPriceController {
  @Autowired private ProductPriceService productPriceService;
  @Autowired private PricingStrategyFactory pricingStrategyFactory;

  @ApiOperation(value = "obtains all product prices by page")
  @GetMapping("/productPrice")
  public Page<ProductPrice> findAll(Pageable pageable) {
    return productPriceService.findAll(pageable);
  }

  @ApiOperation(value = "saves a product price")
  @PostMapping("/productPrice")
  public <S extends ProductPrice> S save(@RequestBody S entity) {
    return productPriceService.save(entity);
  }

  @ApiOperation(value = "calculates the minimum price based on the specified strategy")
  @GetMapping("/productPrice/minimum/{strategyName}/{productName}")
  public double getMinimumPrice(
      @ApiParam(
              allowableValues = "COST_BASED_PRICING,COMPETITION_BASED_PRICING,VALUE_BASED_PRICING")
          @PathVariable
          String strategyName,
      @PathVariable String productName) {
    return pricingStrategyFactory.findByName(strategyName).getMinimumPrice(productName);
  }
}
