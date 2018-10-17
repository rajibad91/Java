package com.besant.variable;

/*
 * Employee class
 */
public class Employee {
	// static variable
	public static final String ORG_NAME = "Intel";
	// Instance variable
	public int empId ;
	public String empName;
	
	 private Employee(int id,String name)
	{
		this.empId=id;
		this.empName=name;
	}
	
	public void getEmployeeDetails()
	{
		int i=10;
		System.out.println("local variable: "+i);
		System.out.println("static variable: "+ORG_NAME);
		System.out.println("Instance variable: "+empId);
	}
	public static Employee getEmployeeObject()
	{
		return new Employee(111,"RLD");
	}

}
