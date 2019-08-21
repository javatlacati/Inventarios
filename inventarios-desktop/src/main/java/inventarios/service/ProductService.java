package inventarios.service;

import inventarios.to.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    public void save(Product product) {
        restTemplate.getForEntity("http://localhost:8080/products", Product.class, product);
    }

    public Optional<Product> findOne(Product sampleProduct) {
        if(sampleProduct == null){
            return Optional.empty();
        }
        return Optional.ofNullable(restTemplate.postForObject("http://localhost:8080/product", sampleProduct, Product.class));
    }

    public List<Product> findAll() {
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                "http://localhost:8080/products/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {
        });
        List<Product> products = response.getBody();
        return products;
    }

    public void delete(Product product) {
        restTemplate.delete("http://localhost:8080/products", product);
    }
}
