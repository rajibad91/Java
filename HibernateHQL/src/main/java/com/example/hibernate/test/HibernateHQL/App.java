package com.example.hibernate.test.HibernateHQL;

import java.util.List;

import com.example.hibernate.data.Department;
import com.example.hibernate.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		EmployeeService service = new EmployeeService();
//		for (Employee emp : service.getAllEmployeesService()) {
//			System.out.println("Employee name is: " + emp.getEmpName());
//			System.out.println("Employee id is: " + emp.getEmpId());
//		}
		
//		for(Employee emp:service.getEmployeeByIDService())
//		System.out.println("Name :"+emp.getEmpName() +":::"+"ïd : "+emp.getEmpId());
//		
//		Employee emp=service.getEmployeeOnCondition();
//		System.out.println("Name :"+emp.getEmpName() +":::"+"ïd : "+emp.getEmpId());
//		List<Object[]> objects=service.getEmployeeByNativeSqlQuery();
//		for(Object[] obj1:objects)
//			System.out.println("Name :"+obj1[1] +":::"+"ïd : "+obj1[0]);
		
//		for (Department dept : service.getDepartments()) {
//			System.out.println("Dept is is: "+dept.getDeptId());
//			System.out.println("Dept name is: "+dept.getDeptName());
//	}
//		System.out.println("Using Get Method");
//		//Department dep=service.getDepartmentsUsingGet();
//		Department dep=service.getDepartmentsUsingLoad();
//		System.out.println("Dept id is: "+dep.getDeptId());
//		System.out.println("Dept name is: "+dep.getDeptName());
		
		Department dept=new Department();
		dept.setDeptId(8);
		dept.setDeptName("TFS11");
		service.saveDept(dept);		
		System.out.println("Save completed");
		
	}
}
