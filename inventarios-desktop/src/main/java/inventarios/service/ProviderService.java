/* 
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
