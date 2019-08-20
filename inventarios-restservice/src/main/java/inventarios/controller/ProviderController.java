package inventarios.controller;

import inventarios.service.ProviderService;
import inventarios.to.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @GetMapping("/providers")
    public List<Provider> findAll() {
        return providerService.findAll();
    }

    @PostMapping("/providers")
    public <S extends Provider> S save(S s) {
        return providerService.save(s);
    }
}
