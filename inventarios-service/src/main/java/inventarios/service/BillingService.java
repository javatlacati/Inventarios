package inventarios.service;

import inventarios.repository.BillingRepository;
import inventarios.to.BillingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {
    @Autowired
    private BillingRepository billingRepository;

    public List<BillingDetails> findAll() {
        return billingRepository.findAll();
    }
}
