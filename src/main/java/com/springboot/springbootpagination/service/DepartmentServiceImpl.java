package com.springboot.springbootpagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootpagination.domain.DepartmentDetails;
import com.springboot.springbootpagination.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDetails> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public DepartmentDetails findByDeptId(String deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentDetails saveDepartMent(DepartmentDetails deptDetails) {
	return departmentRepository.saveAndFlush(deptDetails);
		
	}

	@Override
	public void deleteDeptById(String deptId) {
		// TODO Auto-generated method stub
		
	}

}
