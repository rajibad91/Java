package com.example.hibernate.test.FirstHibernate;

import org.hibernate.Session;

import com.example.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee emp1=new Employee();
        emp1.setEmpName("Rajiba");
        session.save(emp1);
        
        Employee emp2=new Employee();
        emp2.setEmpName("Lochan");
        session.save(emp2);
        
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        
        System.out.println("Success");
    }
}
