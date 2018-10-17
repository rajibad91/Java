package com.example.spring.DIForCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("DIForCollection.xml");
		Employee emp=(Employee)context.getBean("empBean");
		System.out.println("name is: "+emp.getNames()+" and salary is: "+emp.getSalaries()+" Address is: "+emp.getAddress().getCity()+"::"+emp.getAddress().getState()+"::"+emp.getAddress().getZip());;
	System.out.println(emp.getAge());
	System.out.println(emp.getProjects());
	}

}
