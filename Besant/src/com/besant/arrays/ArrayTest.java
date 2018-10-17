package com.besant.arrays;

public class ArrayTest {
	int[] arr=new int[10];
	public void insertToArray()
	{
		arr[0]=1;
		arr[1]=2;
		arr[6]=7;
	}
	public static void main(String[] args)
	{
		ArrayTest at=new ArrayTest();
		at.insertToArray();
		System.out.println(at.arr[0]);
		System.out.println(at.arr[1]);
		System.out.println(at.arr[2]);
		System.out.println(at.arr[6]);
		
		System.out.println(true && false);
		System.out.println('P' & 'R');
	}

}
