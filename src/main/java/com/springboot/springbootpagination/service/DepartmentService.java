package com.springboot.springbootpagination.service;

import java.util.List;

import com.springboot.springbootpagination.domain.DepartmentDetails;

public interface DepartmentService {
	public List<DepartmentDetails> findAll();
	public DepartmentDetails  findByDeptId(String deptId);
	public DepartmentDetails saveDepartMent(DepartmentDetails deptDetails);
	public void deleteDeptById(String deptId);

}
