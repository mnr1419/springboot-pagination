package com.springboot.springbootpagination.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.springbootpagination.domain.EmployeeDetails;
import com.springboot.springbootpagination.repository.EmployeePaginationRepository;
import com.springboot.springbootpagination.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeePaginationRepository paginationRepository;
	@Override
	public List<EmployeeDetails> findAll() {
		System.out.println("FindAll method calling.......");
		 
		List<EmployeeDetails> details = employeeRepository.findAll();
		return details;
	}
	@Override
	public EmployeeDetails  findByEmployeeId(String empId) {
		// TODO Auto-generated method stub
		System.out.println("findByEmployeeId method calling.......");
		return employeeRepository.findByEmployeeId(Integer.parseInt(empId));
		
	}
	@Override
	public boolean saveEmployeeId(EmployeeDetails empdetails) {
		EmployeeDetails detail = (EmployeeDetails) employeeRepository.saveAndFlush(empdetails);
		if(Objects.nonNull(detail)){
			return true;
		}
		return false;
	}
	@Override
	public void deleteEmployeeById(String empId) {
		if(Objects.nonNull(empId)){
			employeeRepository.deleteEmployeeById(Integer.parseInt(empId));
		}
		
	}
	@Override
	public List<EmployeeDetails> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy) {
		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		 
		//Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(
	   // Order.asc("name"),
	   // Order.desc("id")));
		
		// For more detail refer this url
		//https://howtodoinjava.com/spring-boot2/pagination-sorting-example/
		
        Page<EmployeeDetails> pagedResult = paginationRepository.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<EmployeeDetails>();
        }
	}

}
