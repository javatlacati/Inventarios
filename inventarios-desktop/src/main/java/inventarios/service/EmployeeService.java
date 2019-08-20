package inventarios.service;

import inventarios.to.EmployeeDetail;
import inventarios.to.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Service
public class EmployeeService {
    private RestTemplate restTemplate;

    @Autowired
    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void save(EmployeeDetail employee) {
        restTemplate.getForEntity("http://localhost:8080/employees", EmployeeDetail.class, employee);
    }

    public List<EmployeeDetail> findAll() {        
        ResponseEntity<List<EmployeeDetail>> response = restTemplate.exchange(
                "http://localhost:8080/employees/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EmployeeDetail>>() {
        });
        List<EmployeeDetail> employees = response.getBody();
        return employees;
    }
}
