package com.besant.java8;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		Mapped mapped=new Mapped(map);
		TreeMap<String,Integer> tm=new TreeMap<String, Integer>(mapped);
		map.put("a", 10);
		map.put("b", 30);
		map.put("c", 20);
		map.put("d", 15);
		map.put("e", 5);
		
		System.out.println("unsorted Map is: "+map);
		tm.putAll(map);
		System.out.println("Sorted Map by value is: "+tm);
		
		

	}

}

class Mapped implements Comparator<String>
{
	Map<String,Integer> base;
	Mapped(Map<String,Integer> base)
	{
		this.base=base;
	}

	@Override
	public int compare(String o1, String o2) {
		if(base.get(o1)>=base.get(o2))
		{
			return 1;
		}
		else
			return -1;
	}
	
}
