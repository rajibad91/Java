package com.example.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.example.hibernate.data.Department;
import com.example.hibernate.util.HibernateUtil;
public class DepartmentDAO {
	
	public List<Department> getDepartments()
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=session.getNamedQuery("Department_getDepartment");
		List<Department> list=query.list();
		return list;
	}

	public Department getDepartmentsUsingGet()
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Department dept=(Department)session.get(Department.class,1);
		
		return dept;
	}
	
	public Department getDepartmentsUsingLoad()
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Department dept=(Department)session.load(Department.class,4);
		
		return dept;
	}
	
	public void saveDept(Department dept)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(dept);
		session.getTransaction().commit();
		//session.flush();
		
	}
}
