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

import inventarios.repository.ProductRepository;
import inventarios.service.restclient.ProductService;
import inventarios.to.Product;
import inventarios.to.ProductCharacteristic;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Before
    public void setUp() throws Exception {
        productService = new ProductService(productRepository);
    }

    @Test
    public void findAll() {
        ProductCharacteristic characteristics = new ProductCharacteristic();
        Product product = new Product(1L, new Date(),new Date(),"name",5,"serial", characteristics);
        when(productRepository.findAll()).thenReturn(Collections.singletonList(product));
        assertEquals(Collections.singletonList(product), productService.findAll());
    }

    @Test
    public void save() {
    }

    @Test
    public void findOne() {
    }

    @Test
    public void delete() {
    }
}
