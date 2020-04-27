package com.springboot.springbootpagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootpagination.domain.DepartmentDetails;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentDetails, Long> {
	

}
