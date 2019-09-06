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

import inventarios.repository.PurchaseRepository;
import inventarios.to.OrderDetail;
import inventarios.to.Product;
import inventarios.to.Provider;
import inventarios.to.Purchase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@RunWith(MockitoJUnitRunner.class)
public class PurchaseServiceTest {

    @InjectMocks
    private PurchaseService purchaseService;

    @Mock
    private PurchaseRepository purchaseRepository;

    @Before
    public void setUp() throws Exception {
        purchaseService = new PurchaseService(purchaseRepository);
    }

    @Test
    public void findAll() {
        Provider provider = new Provider();
        List<Product> products = Arrays.asList(new Product());
        OrderDetail requestingOrder = new OrderDetail();
        Date now = new Date();
        Purchase purchase = new Purchase(1L, now, provider, products, requestingOrder);
        when(purchaseRepository.findAll()).thenReturn(Collections.singletonList(purchase));
        assertEquals(Collections.singletonList(purchase), purchaseService.findAll());
    }

    @Test
    public void save() {
    }
}
