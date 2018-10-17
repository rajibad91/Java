package com.example.hibernate.data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="RLD.dbo.EmployeeNew")
public class Employee implements Serializable {

	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;
	public Employee() {
		
	}
	public Employee(String empName,String email)
	{
		
		this.empName=empName;
		this.email=email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String empName;
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	private Set<Accounts> accounts;
	
	
	public Set<Accounts> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Accounts> accounts) {
		this.accounts = accounts;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
