package com.example.spring.annotationswithXML;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String empId;
	private String empName;
	private Address address;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
