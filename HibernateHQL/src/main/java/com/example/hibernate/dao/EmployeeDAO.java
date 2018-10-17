package com.example.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.example.hibernate.data.Employee;
import com.example.hibernate.util.HibernateUtil;

public class EmployeeDAO {

	public List<Employee> getAllEmployees() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Employee> empList = session.createQuery("from Employee").list();
		//HibernateUtil.shutdown();
		return empList;
	}

	public List<Employee> getEmployeeByID() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//Employee emp = (Employee) session.createQuery("from Employee where empId=1").uniqueResult();
		//HibernateUtil.shutdown();
		Criteria cr=session.createCriteria(Employee.class);
		List<Employee> emp= cr.list();
		return emp;
	}
	public Employee getEmployeeOnCondition()
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("empName", "Lochan"));
		criteria.add(Restrictions.eq("empId",2));
		Employee emp=(Employee) criteria.uniqueResult();
		return emp;
		
	}
	
	public List<Employee> getEmployeeByOrder() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.addOrder(Order.asc("empName"));
		List<Employee> emp= criteria.list();
		return emp;
		
	}
	
	
	public List<Employee> getEmployeeByPagination() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.setFirstResult(7);
		criteria.setMaxResults(8);
		List<Employee> emp= criteria.list();
		return emp;
		
	}
	
	public List<Object[]> getEmployeeByNativeSqlQuery() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String SQLquery="SELECT TOP 1000 [empId],[empName]  FROM [RLD].[dbo].[Employee]";
		//Query query=session.createSQLQuery(SQLquery).addEntity(Employee.class);
		List<Object[]> query=session.createSQLQuery(SQLquery).list();
		//List emp= query.list();
		return query;
		
	}
}
