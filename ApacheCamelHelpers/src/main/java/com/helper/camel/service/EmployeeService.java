package com.helper.camel.service;

import com.helper.bo.EmployeeBo;

public interface EmployeeService {

	public EmployeeBo getEmployee(Integer employeeId);

	public Integer saveEmployee(EmployeeBo employeeBo);

}
