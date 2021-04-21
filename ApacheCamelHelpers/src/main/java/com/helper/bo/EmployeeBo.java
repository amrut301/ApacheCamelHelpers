package com.helper.bo;

/**
 * @author amrmalaj
 *
 */
public class EmployeeBo extends BaseBo {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -4707243769224797397L;

	private Integer employeeId;

	private String name;

	private Integer age;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
