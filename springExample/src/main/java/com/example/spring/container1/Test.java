package com.example.spring.container1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory bean=new XmlBeanFactory(new ClassPathResource("pojo1.xml"));
		Pojo1 pojoBean=(Pojo1)bean.getBean("pojoBean");
		pojoBean.setPojoId(555);
		System.out.println(pojoBean.getPojoId());
	}

}
