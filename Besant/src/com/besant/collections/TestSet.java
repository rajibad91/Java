package com.besant.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args)
	{
		//Set<String> set=new HashSet<>();
		//Set<String> set=new LinkedHashSet<>();
		Employee emp1=new Employee();
		emp1.setId(100);
		emp1.setName("Rajiba");
		Employee emp2=new Employee();
		emp2.setId(200);
		emp2.setName("Lochan");
		Employee emp3=new Employee();
		emp3.setId(300);
		emp3.setName("Dixit");
		HashSet<Employee> set=new HashSet<>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		System.out.println(set);
		set.forEach(str->{
			System.out.println( str.getId()+":::"+((Employee) str).getName());
		});
		ArrayList<Employee> list=new ArrayList<>(set);
		for(int i=0;i<list.size();i++)
		{
			Employee emp= list.get(i);
			System.out.println(emp.getName());
		}
	}

}
