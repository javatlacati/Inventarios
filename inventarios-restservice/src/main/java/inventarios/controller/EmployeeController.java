package inventarios.controller;

import inventarios.service.EmployeeService;
import inventarios.to.EmployeeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    List<EmployeeDetail> all() {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    EmployeeDetail newEmployee(@RequestBody EmployeeDetail newEmployee) {
        return employeeService.save(newEmployee);
    }

//    @GetMapping("/employees/{id}")
//    EmployeeDetail one(@PathVariable Long id) {
//
//        return employeeService.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//    }
}
