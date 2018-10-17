package com.besant.collections;

public class Employee implements Comparable {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void print()
	{
		System.out.println("Inside Employee Static method");
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return this.id-((Employee)arg0).id;
	}
	
	
}
