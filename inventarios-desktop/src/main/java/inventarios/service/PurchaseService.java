package inventarios.service;

import inventarios.to.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private RestTemplate restTemplate;

    public void save(Purchase purchase) {
        restTemplate.getForEntity("http://localhost:8080/purchases", Purchase.class, purchase);
    }

    public List<Purchase> findAll() {
        ResponseEntity<List<Purchase>> response = restTemplate.exchange(
                "http://localhost:8080/purchases/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Purchase>>() {
                });
        List<Purchase> employees = response.getBody();
        return employees;
    }
}
