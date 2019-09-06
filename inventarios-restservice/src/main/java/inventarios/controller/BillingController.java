package inventarios.controller;

import inventarios.service.BillingService;
import inventarios.to.BillingDetails;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {
    @Autowired
    private BillingService billingService;

    @GetMapping("/billing")
    public List<BillingDetails> all() {
        return billingService.findAll();
    }
}
