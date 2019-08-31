package inventarios.controller;

import inventarios.service.BillingService;
import inventarios.to.BillingDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillingController {
    private BillingService billingService;

    @GetMapping("/billing")
    public List<BillingDetails> all() {
        return billingService.findAll();
    }
}
