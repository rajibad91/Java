package com.besant.collections;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Chennai");
		linkedList.add("Bangalore");
		linkedList.add("Mumabai");
		linkedList.add(1, "Kolkata");
		
//		for (String string : linkedList) {
//			System.out.println(string);
//			//System.out.println(linkedList.size());
//		}
		String[] str=new String[linkedList.size()];
		for(int i=0;i<linkedList.size();i++)
		{
			System.out.println(linkedList.get(i));
			
			str[i]=linkedList.get(i);
		}
		for (int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]);
			
			
		}

	}

}
