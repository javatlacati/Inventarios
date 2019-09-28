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

import inventarios.repository.OrderRepository;
import inventarios.to.EmployeeDetail;
import inventarios.to.OrderDetail;
import inventarios.to.Product;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.any;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderService orderService;

    @Mock
    private OrderRepository orderRepository;

    @Before
    public void setUp() throws Exception {
        orderService = new OrderService(orderRepository);
    }

    @Test
    public void findAll() {
        List<Product> products = Arrays.asList(new Product());
        EmployeeDetail employeeDetail = new EmployeeDetail();
        OrderDetail provider = new OrderDetail(1L, "654654564", products, employeeDetail, new Date());
        when(orderRepository.findAll()).thenReturn(Collections.singletonList(provider));
        assertEquals(Collections.singletonList(provider), orderService.findAll());
    }

    @Test
    public void save() {
        List<Product> products = Arrays.asList(new Product());
        EmployeeDetail employeeDetail = new EmployeeDetail();
        OrderDetail provider = new OrderDetail(1L, "654654564", products, employeeDetail, new Date());
        
        when(orderRepository.save(any(OrderDetail.class)))
                .thenReturn(provider);
        
        assertEquals(provider, orderService.save(provider));
    }
}
