package com.example.spring.DIforBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("DIforBean.xml");
		Employee emp=(Employee)context.getBean("empBean");
		System.out.println("name is: "+emp.getEmpName()+" and employee id is: "+emp.getEmpId()+" Address is: "+emp.getAddress().getCity()+"::"+emp.getAddress().getState()+"::"+emp.getAddress().getZip());;
	System.out.println("Project name is: "+emp.getProjectEmployee().getProjectName()+" Poject member count is: "+emp.getProjectEmployee().getProjectMemberCount());
	}

}
