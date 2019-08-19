package inventarios.service;

import inventarios.to.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    public void save(Product product) {
        restTemplate.getForEntity("http://localhost:8080/products", Product.class, product);
    }

    public Optional<Product> findOne(Product sampleProduct) {
        return Optional.ofNullable(restTemplate.postForObject("http://localhost:8080/products", sampleProduct, Product.class));
    }

    public List<Product> findAll() {
        Object o = null;
        ResponseEntity<List> forEntity = restTemplate.getForEntity("http://localhost:8080/products", List.class, o);
        return (List<Product>) forEntity;
    }

    public void delete(Product product) {
        restTemplate.delete("http://localhost:8080/products", product);
    }
}
