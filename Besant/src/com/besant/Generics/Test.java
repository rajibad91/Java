package com.besant.Generics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Box<String> box=new Box<String>();
		// box.setT("rld");
		Box<Integer> box1 = new Box<Integer>();
		box1.setT(123);
		BoxMap<String, String> bMap=new BoxMap<String, String>();
		bMap.setKey("Key");
		bMap.setValue("Value");
		
		System.out.println(bMap.getKey()+":::"+bMap.getValue());

	}

}
