package inventarios.service;

import inventarios.to.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Provider> findAll() {
        ResponseEntity<List<Provider>> response = restTemplate.exchange(
                "http://localhost:8080/providers/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Provider>>() {
                });
        List<Provider> employees = response.getBody();
        return employees;
    }

    public void save(Provider provider) {
        restTemplate.getForEntity("http://localhost:8080/providers", Provider.class, provider);
    }
}
