package inventarios.controller.product.pricing;

import inventarios.service.ProductPriceService;
import inventarios.to.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductPriceController {
    @Autowired
    private ProductPriceService productPriceService;

    public Page<ProductPrice> findAll(Pageable pageable) {
        return productPriceService.findAll(pageable);
    }

    public <S extends ProductPrice> S save(S entity) {
        return productPriceService.save(entity);
    }
}
