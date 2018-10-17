package com.example.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service("emp")
public class Employee {
	
	private String empId;
	private String empName;
	private Address address;
	public String getEmpId() {
		return empId;
	}
	@Value("100")
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		System.out.println("after aop");
		return empName;
	}
	@Value("BABU")
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
