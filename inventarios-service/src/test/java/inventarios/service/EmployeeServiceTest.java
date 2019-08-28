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

import inventarios.repository.EmployeeRepository;
import inventarios.to.EmployeeDetail;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp() throws Exception {
        employeeService = new EmployeeService(employeeRepository);
    }

    @Test
    public void save() {
        EmployeeDetail detail = new EmployeeDetail(null, "123", "employee names", "middle name", "last name", "homa adress", "Manager", "no", "now");
        EmployeeDetail detail1 = new EmployeeDetail(1L, "123", "employee names", "middle name", "last name", "homa adress", "Manager", "no", "now");
        when(employeeRepository.save(eq(detail))).thenReturn(detail1);
        assertEquals(detail1, employeeService.save(detail));
    }

    @Test
    public void findAll() {
        EmployeeDetail detail = new EmployeeDetail(1L, "123", "employee names", "middle name", "last name", "homa adress", "Manager", "no", "now");
        when(employeeRepository.findAll()).thenReturn(Collections.singletonList(detail));
        assertEquals(Collections.singletonList(detail), employeeService.findAll());
    }
}
