package com.aniket.dockercompose.controller;

import com.aniket.dockercompose.model.Employee;
import com.aniket.dockercompose.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository){
        this.repository = repository;
    }

    @PostMapping
    private ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

         Employee savedEmployee = repository.save(employee);
         return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<Employee>> getEmployees(){

        List<Employee> listOfEmployee = repository.findAll();
        return new ResponseEntity<>(listOfEmployee, HttpStatus.OK);

    }


}
