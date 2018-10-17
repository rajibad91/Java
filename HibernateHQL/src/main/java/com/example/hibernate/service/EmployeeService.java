package com.example.hibernate.service;

import java.util.List;

import com.example.hibernate.dao.DepartmentDAO;
import com.example.hibernate.dao.EmployeeDAO;
import com.example.hibernate.data.Department;
import com.example.hibernate.data.Employee;

public class EmployeeService {
	EmployeeDAO employeeDao = new EmployeeDAO();

	public List<Employee> getAllEmployeesService() {

		List<Employee> empList = employeeDao.getAllEmployees();
		return empList;
	}

	public List<Employee> getEmployeeByIDService() {
		List<Employee> emp = employeeDao.getEmployeeByID();
		return emp;
	}
	public Employee getEmployeeOnCondition()
	{
		Employee emp=employeeDao.getEmployeeOnCondition();
		return emp;
	}
	
	public List<Employee> getEmployeeByOrder() {
		List<Employee> emp=employeeDao.getEmployeeByOrder();
		return emp;
	}
	
	public List<Employee> getEmployeeByPagination() {
		List<Employee> emp=employeeDao.getEmployeeByPagination();
		return emp;
	}
	
	public List<Object[]> getEmployeeByNativeSqlQuery() {
		List<Object[]> emp=employeeDao.getEmployeeByNativeSqlQuery();
		return emp;
	}
	
	DepartmentDAO departmentDao=new DepartmentDAO();
	public List<Department> getDepartments() {
		List<Department> dept=departmentDao.getDepartments();
		return dept;
	}
	
	public Department getDepartmentsUsingGet()
	{
		Department dept=departmentDao.getDepartmentsUsingGet();
		return dept;
	}
	public Department getDepartmentsUsingLoad()
	{
		Department dept=departmentDao.getDepartmentsUsingLoad();
		return dept;
	}
	
	public void saveDept(Department dept)
	{
		departmentDao.saveDept(dept);
	}
}
