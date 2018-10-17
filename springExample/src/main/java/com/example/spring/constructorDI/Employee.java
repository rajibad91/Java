/**
 * 
 */
package com.example.spring.constructorDI;

/**
 * Pojo class
 *
 */
public class Employee {

	private String empName;

	public String getEmpName() {
		return empName;
	}

	/*public void setEmpName(String empName) {
		this.empName = empName;
	}*/

	private int empId;

	public int getEmpId() {
		return empId;
	}

	/*public void setEmpId(int empId) {
		this.empId = empId;
	}*/
	
	public Employee(int id,String name)
	{
		this.empId=id;
		this.empName=name;
		
	}
	

}
