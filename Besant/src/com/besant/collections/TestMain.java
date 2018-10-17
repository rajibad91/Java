package com.besant.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Mumbai");
		list.add("Delhi");
		for (int i=0;i<list.size();i++)
		{
			System.out.println("Normal For Loop");
			System.out.println(list.get(i));
		}
		
		list.forEach(string->{System.out.println("Lamda Expression");
			System.out.println(string);});

		List<String> linkList=new LinkedList<>();
		list.add("Rajiba");
		list.add("Lochan");
		list.add("Dixit");
		list.forEach(string->{
			System.out.println(string);
		
		});
		
	}

}
