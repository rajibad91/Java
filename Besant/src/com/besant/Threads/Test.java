package com.besant.Threads;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main method");
//		ThreadExample obj1=new ThreadExample();
//		Thread t1=new Thread(obj1);
//		t1.start();
		
		ThreadClassExample t2= new ThreadClassExample();
		t2.start();
		
		ThreadClassExample t3= new ThreadClassExample();
		t3.start();

	}

}
