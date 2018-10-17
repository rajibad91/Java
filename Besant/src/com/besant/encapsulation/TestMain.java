package com.besant.encapsulation;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eployee emp=new Eployee();
		emp.setId(1);
		emp.setName("RLD");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
Eployee emp2=new Eployee();
		emp2.setId(2);
		emp2.setName("Lochan");
		emp2.setAge(27.9f);
		emp2.setAddress("Marathalli");
		System.out.println(emp2.getId() +" : "+emp2.getName()+" : "+emp2.getAge()+" : "+emp2.getAddress());
	}

}
