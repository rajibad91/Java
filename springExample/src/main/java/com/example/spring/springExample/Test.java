package com.example.spring.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Personal_JAVA\\springExample\\src\\main\\resources\\applicationContext.xml");
//		Employee emp=(Employee)context.getBean("empBean");
//		emp.setEmpId(631);
//		emp.setEmpName("Rajiba");
//		System.out.println(emp.getEmpId());
//		System.out.println(emp.getEmpName());
		
		ApplicationContext contextStudent=new ClassPathXmlApplicationContext("Student.xml");
		Student stud=(Student)contextStudent.getBean("stdBean");
		System.out.println(stud);
		stud.setStudentName("Student1");
		System.out.println(stud.getStudentName());
	}

}
