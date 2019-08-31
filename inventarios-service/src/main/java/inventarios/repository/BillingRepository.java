package inventarios.repository;

import inventarios.to.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<BillingDetails, Long> {
}
