package com.training.javarest.controller;

import com.training.javarest.entity.Employee;
import com.training.javarest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Access point of your api

@RestController
@RequestMapping("/rest/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return employeeService.findAllEmployee();
    }

    @PostMapping("/save") // http call method which ll be used in 2 case for insert / update
    public Employee save(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update") // http method for update
    public Employee update(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "SUCCESS";
    }


}
