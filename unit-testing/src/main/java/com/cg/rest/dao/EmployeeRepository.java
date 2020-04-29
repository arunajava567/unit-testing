package com.cg.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long> 
{
	 
}
