package com.besant.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,String> map=new HashMap<>();
		map.put("emp1","Rajiba");
		map.put("emp2","Lochan");
		map.put(null,"Rajiba");
		System.out.println(map.get("emp2"));
		System.out.println(map);
		
//		Set<String> set=map.keySet();
//		for (String string : set) {
//			System.out.println(map.get(string));
//			
//		}
//		
//		Set<Entry<String,String>> s=map.entrySet();
//		for (Entry<String, String> entry : s) {
//			System.out.println(entry);
//			
//		}
		
		map.forEach((key,value)->System.out.println(key +" : lamda :  "+value));

	}

}
