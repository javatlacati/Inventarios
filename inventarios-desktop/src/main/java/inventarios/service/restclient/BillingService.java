package inventarios.service.restclient;

import inventarios.to.BillingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private RestTemplate restTemplate;

    public List<BillingDetails> findAll() throws HttpServerErrorException {
        ResponseEntity<List<BillingDetails>> response = restTemplate.exchange(
                "http://localhost:8080/billing/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<BillingDetails>>() {
        });
        List<BillingDetails> employees = response.getBody();
        return employees;
    }
}
