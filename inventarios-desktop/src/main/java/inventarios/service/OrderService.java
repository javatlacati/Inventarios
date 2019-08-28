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

import inventarios.to.OrderDetail;
import inventarios.to.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;
    
    public List<OrderDetail> findAll() {
        ResponseEntity<List<OrderDetail>> response = restTemplate.exchange(
                "http://localhost:8080/orders/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<OrderDetail>>() {
        });
        List<OrderDetail> employees = response.getBody();
        return employees;
    }
    
    public void save(OrderDetail orderDetail) {
        restTemplate.getForEntity("http://localhost:8080/orders", OrderDetail.class, orderDetail);
    }
}
