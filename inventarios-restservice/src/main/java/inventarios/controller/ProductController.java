package inventarios.controller;

import inventarios.service.ProductService;
import inventarios.to.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/products")
    public <S extends Product> S save(S s) {
        return productService.save(s);
    }

    @GetMapping("/products")
    public <S extends Product> Optional<S> findOne(@RequestBody S product) {
        return productService.findOne(Example.of(product));
    }

    @DeleteMapping("/products")
    public void delete(@RequestBody Product product) {
        productService.delete(product);
    }
}
