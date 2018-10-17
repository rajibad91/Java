package com.example.spring.MultipleConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context1=new ClassPathXmlApplicationContext(new String[] {"Student.xml", "College.xml"});
//		College clg=(College)context1.getBean("collegeBean");
//		System.out.println(clg.getCollegeName());
		
		//By Importing config file.
		ApplicationContext context=new ClassPathXmlApplicationContext("Student.xml");
		Student std=(Student)context.getBean("stdBean");
		System.out.println(std.getsName());
		System.out.println(std.getsId());
		System.out.println(std.getCollege().getCollegeName());
	}

}
