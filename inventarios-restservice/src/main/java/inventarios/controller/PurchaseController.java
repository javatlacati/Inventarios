package inventarios.controller;

import inventarios.service.PurchaseService;
import inventarios.to.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchases")
    public List<Purchase> findAll() {
        return purchaseService.findAll();
    }

    @PostMapping("/purchases")
    public <S extends Purchase> S save(S s) {
        return purchaseService.save(s);
    }
}
