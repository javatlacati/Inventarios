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

import inventarios.repository.ProviderRepository;
import inventarios.service.restclient.ProviderService;
import inventarios.to.Provider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@RunWith(MockitoJUnitRunner.class)
public class ProviderServiceTest {

    @InjectMocks
    private ProviderService providerService;

    @Mock
    private ProviderRepository providerRepository;

    @Before
    public void setUp() throws Exception {
        providerService = new ProviderService(providerRepository);
    }

    @Test
    public void findAll() {
        Provider provider = new Provider(1L, "provider name","address","last name","number","654654564","e@mail.com","92551");
        when(providerRepository.findAll()).thenReturn(Collections.singletonList(provider));
        assertEquals(Collections.singletonList(provider), providerService.findAll());
    }

    @Test
    public void save() {
    }
}
