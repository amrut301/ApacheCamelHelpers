package com.helper.camel.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helper.camel.dao.entities.Employee;

/**
 * @author amrmalaj
 *
 */
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
