/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.service;

import inventarios.repository.ProductRepository;
import inventarios.to.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Ivana Martinez C
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public <S extends Product> S save(S s) {
        return productRepository.save(s);
    }

    public <S extends Product> Optional<S> findOne(Example<S> exmpl) {
        return productRepository.findOne(exmpl);
    }

    public void delete(Product t) {
        productRepository.delete(t);
    }

}
