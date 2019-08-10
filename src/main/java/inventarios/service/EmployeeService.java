/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios.service;

import inventarios.repository.EmployeeRepository;
import inventarios.to.EmployeeDetail;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public <S extends EmployeeDetail> S save(S s) {
        return employeeRepository.save(s);
    }

    public List<EmployeeDetail> findAll() {
        return employeeRepository.findAll();
    }
    
    
}
