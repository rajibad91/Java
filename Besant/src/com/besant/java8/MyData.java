package com.besant.java8;

public class MyData implements MyDataInterface {
	public   boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	public static void main(String[] args) {
		MyData obj = new MyData();
		obj.print("abc");
		obj.isNull("abc");

	}

}
