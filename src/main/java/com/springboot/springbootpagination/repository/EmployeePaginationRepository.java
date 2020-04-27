package com.springboot.springbootpagination.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.springbootpagination.domain.EmployeeDetails;

public interface EmployeePaginationRepository extends PagingAndSortingRepository<EmployeeDetails, Long> {

}
