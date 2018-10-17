package com.example.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJDBC.xml");
		DBOperationBean db = (DBOperationBean) context.getBean("dop");
		
		System.out.println(db);
		System.out.println("No of records inserted : " + db.insertInfo("4", "Dixit", "bangalore"));
		System.out.println("Record Count : " + db.countStudents());
		System.out.println(db.getStudentDetails("3"));
		
	}

}
