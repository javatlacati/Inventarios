package inventarios.service;

import inventarios.to.Product;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    public void save(Product product) {

    }

    public Optional<Product> findOne(Product sampleProduct) {
        return null;
    }

    public List<Product> findAll() {
        return Collections.emptyList();
    }

    public void delete(Product product) {

    }
}
