/**
 * 
 */
package com.example.spring.DIforBean;

/**
 * Pojo class
 *
 */
public class Employee {

	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	private ProjectEmployee proj;
	
	public Employee(ProjectEmployee pe)
	{
		this.proj=pe;
		
	}
	public ProjectEmployee getProjectEmployee() {
		return proj;
	}

}
