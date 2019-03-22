package com.helper.camel.dao;

import java.util.Optional;

import com.helper.bo.EmployeeBo;
import com.helper.camel.dao.entities.Employee;

public interface EmployeeDao {

	public Optional<Employee> getEmployee(Integer employeeId);

	public Integer saveEmployee(EmployeeBo employeeBo);

}
