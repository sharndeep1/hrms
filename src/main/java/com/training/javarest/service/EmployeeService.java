package com.training.javarest.service;


import com.training.javarest.entity.Employee;
import com.training.javarest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository; // Dependency Injection

    //create
    public Employee saveEmployee(Employee employee){
        Employee empSave = employeeRepository.save(employee);
        return empSave;
    }

    //update
    public Employee updateEmployee(Employee employee){
        Employee empSave = employeeRepository.save(employee);
        return empSave;
    }

    //delete
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    //fetch - retrieve
    public List<Employee> findAllEmployee(){
        List<Employee> allRec = employeeRepository.findAll();
        return allRec;
    }


}
