package com.helper.camel.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helper.bo.EmployeeBo;
import com.helper.camel.dao.EmployeeDao;
import com.helper.camel.dao.entities.Employee;

/**
 * @author amrmalaj
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	@Override
	public EmployeeBo getEmployee(Integer employeeId) {
		EmployeeBo employeeBo = new EmployeeBo();
		Optional<Employee> emp = null;
		try {
			emp = employeeDao.getEmployee(employeeId);
			if (emp.isPresent()) {
				employeeBo.setEmployeeId(emp.get().getEmployeeId());
				employeeBo.setAge(emp.get().getAge());
				employeeBo.setName(emp.get().getEmployeeName());
			}
		} catch (Exception e) {

		}
		return employeeBo;
	}

	@Override
	public Integer saveEmployee(EmployeeBo employeeBo) {
		// TODO Auto-generated method stub
		return null;
	}

}
