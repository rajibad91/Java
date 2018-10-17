package com.example.spring.AutoWire;

public class BeanAutoWire {
	public BeanAutoWire()
	{
		
	}
	public BeanAutoWire(BeanByConstructor beanByConstructor)
	{
		this.beanByConstructor=beanByConstructor;
	}
	private BeanByName beanByName;
	public BeanByName getBeanByName() {
		return beanByName;
	}


	public void setBeanByName(BeanByName beanByName) {
		this.beanByName = beanByName;
	}


	public BeanByType getBeanByType() {
		return beanByType;
	}


	public void setBeanByType(BeanByType beanByType) {
		this.beanByType = beanByType;
	}


	public BeanByConstructor getBeanByConstructor() {
		return beanByConstructor;
	}


	private BeanByType beanByType;
	
	
	private BeanByConstructor beanByConstructor;

}
