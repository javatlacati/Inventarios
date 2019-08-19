package inventarios.service;

import inventarios.to.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private RestTemplate restTemplate;

    public void save(Purchase purchase) {

    }

    public List<Purchase> findAll() {
        return Collections.emptyList();
    }
}
