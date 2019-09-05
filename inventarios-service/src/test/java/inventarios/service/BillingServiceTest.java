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

import inventarios.repository.BillingRepository;
import inventarios.to.BillingDetails;
import inventarios.to.EmployeeDetail;
import java.util.Collections;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@RunWith(MockitoJUnitRunner.class)
public class BillingServiceTest {

    @InjectMocks
    private BillingService billingService;

    @Mock
    private BillingRepository billingRepository;

    @Before
    public void setUp() throws Exception {
        billingService = new BillingService(billingRepository);
    }

    @Test
    public void testFindAll() {
        BillingDetails detail = new BillingDetails(1L, "rfc", "rs", "street name", "ne", "ni", "colony", "locality", "dm", "state", "country", "pobox", "e@mail.com");
        when(billingRepository.findAll()).thenReturn(Collections.singletonList(detail));
        assertEquals(Collections.singletonList(detail), billingService.findAll());
    }

}
