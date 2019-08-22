/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.service;

import inventarios.repository.ProviderRepository;
import inventarios.to.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Ivana Martinez C
 */
@Service
public class ProviderService {
    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> findAll() {
        return providerRepository.findAll();
    }

    public <S extends Provider> S save(S s) {
        return providerRepository.save(s);
    }
    
    
}
