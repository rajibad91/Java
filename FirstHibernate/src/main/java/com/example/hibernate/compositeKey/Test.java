package com.example.hibernate.compositeKey;

import org.hibernate.Session;

import com.example.hibernate.util.HibernateUtil;

public class Test {

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
//        Student emp1=new Student();
//        emp1.setStudentName("Rajiba");
//        session.save(emp1);
//        
//        Student emp2=new Student();
//        emp2.setStudentName("Lochan");
//        session.save(emp2);
        
        Registration reg=new Registration();
        reg.setAddress1("Marathalli");
        reg.setAddressId(1);
        
        Address a1=new Address();
        a1.setReg(reg);
        a1.setCity("BLR");
        
        session.saveOrUpdate(a1);
        
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        
        System.out.println("Success");
    }

}
