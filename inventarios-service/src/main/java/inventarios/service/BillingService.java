package inventarios.service;

import inventarios.repository.BillingRepository;
import inventarios.to.BillingDetails;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    private BillingRepository billingRepository;

    @Autowired
    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }
    
    public List<BillingDetails> findAll() {
        return billingRepository.findAll();
    }
}
