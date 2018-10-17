package com.besant.exceptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			TryWithResource twr=new TryWithResource();
			twr.readFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
