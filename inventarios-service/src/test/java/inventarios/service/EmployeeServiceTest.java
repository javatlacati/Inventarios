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
