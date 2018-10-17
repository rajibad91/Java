package com.besant.variable;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee obj = new Employee(10,"Rajiba");
		Employee obj=Employee.getEmployeeObject();
		System.out.println(Employee.ORG_NAME);
		System.out.println(obj.empId);
		obj.getEmployeeDetails();
		Employee obj1=Employee.getEmployeeObject();
		System.out.println(Employee.ORG_NAME);
		System.out.println(obj1.empId);
		obj1.getEmployeeDetails();
	}

}
