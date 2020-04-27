package com.springboot.springbootpagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.springbootpagination.domain.EmployeeDetails;

import com.springboot.springbootpagination.service.EmployeeService;

/* We have to use below URI to hit this controller end points
 * http://localhost:2222/spring-boot-app/employeepagination?pageNo=0&pageSize=5
 * 
 * /spring-boot-app - is context path which is mentioend in the application.properties file
 * 
 * defaultValue = "empId" , the values is property of domain class property which is related to
 * employee_details.emp_id 
 * 
 * 
 * */

@RestController
@RequestMapping("/employeepagination")
public class EmployeePaginationController {
	
	@Autowired
    EmployeeService service;
 
    @GetMapping
    public ResponseEntity<List<EmployeeDetails>> getAllEmployees(
                        @RequestParam(defaultValue = "0") Integer pageNo, 
                        @RequestParam(defaultValue = "10") Integer pageSize,
                        @RequestParam(defaultValue = "empId") String sortBy) 
    {
        List<EmployeeDetails> list = service.getAllEmployees(pageNo, pageSize, sortBy);
 
        return new ResponseEntity<List<EmployeeDetails>>(list, new HttpHeaders(), HttpStatus.OK); 
    }

}
