import inventarios.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.logging.Logger;

import static org.mockito.Mockito.mock;

@Configuration
public class TestingConfiguration {
    private static final Logger LOGGER = Logger.getLogger(TestingConfiguration.class.getName());

    @Bean
    @Profile("mock-person-repository")
// Change method name to change bean name
    public EmployeeRepository employeeRepositoryMock() {
        LOGGER.info("Mocking: " + EmployeeRepository.class);
        return mock(EmployeeRepository.class);
    }
}
