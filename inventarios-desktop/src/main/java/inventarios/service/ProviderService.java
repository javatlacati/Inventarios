package inventarios.service;

import inventarios.to.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Provider> findAll() {
        return Collections.emptyList();
    }

    public void save(Provider provider) {

    }
}
