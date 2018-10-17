package com.besant.exceptions;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			m1("Hello");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void m1(String s) throws CustomException
	{
		if(s.equals("Hello"))
		{
			throw new CustomException("Üser defined Exception");
		}
		else
		{
			System.out.println(s);
		}
	}

}
