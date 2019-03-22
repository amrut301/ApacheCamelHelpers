package com.helper.camel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helper.bo.EmployeeBo;
import com.helper.camel.service.EmployeeService;

/**
 * @author amrmalaj
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeSevice;

	@GetMapping(value = "/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
	EmployeeBo getEmployee(@PathVariable("employeeId") Integer employeeId) {
		try {
			return employeeSevice.getEmployee(employeeId);
		} catch (Exception e) {

		}
		return null;

	}

}
