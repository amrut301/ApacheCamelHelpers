package com.helper.camel.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.helper.bo.EmployeeBo;
import com.helper.camel.dao.entities.Employee;
import com.helper.camel.dao.repository.EmployeeRespository;

/**
 * @author amrmalaj
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeRespository employeeRepository;

	@Override
	public Optional<Employee> getEmployee(Integer employeeId) {
		Optional<Employee> employee = null;

		try {
			employee = employeeRepository.findById(employeeId);
		} catch (Exception e) {

		}
		return employee;
	}

	@Override
	public Integer saveEmployee(EmployeeBo employeeBo) {
		// TODO Auto-generated method stub
		return null;
	}

}
