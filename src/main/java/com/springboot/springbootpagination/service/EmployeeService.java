package com.springboot.springbootpagination.service;

import java.util.List;

import com.springboot.springbootpagination.domain.EmployeeDetails;

public interface EmployeeService {

	public List<EmployeeDetails> findAll();
	public EmployeeDetails  findByEmployeeId(String empId);
	public boolean saveEmployeeId(EmployeeDetails empdetails);
	public void deleteEmployeeById(String empId);
	public List<EmployeeDetails> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy);
}
