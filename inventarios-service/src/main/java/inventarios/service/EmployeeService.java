/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.service;

import inventarios.repository.EmployeeRepository;
import inventarios.to.EmployeeDetail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public <S extends EmployeeDetail> S save(S s) {
        return employeeRepository.save(s);
    }

    public List<EmployeeDetail> findAll() {
        return employeeRepository.findAll();
    }
    
    
}
