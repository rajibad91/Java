package com.besant.IOStreams;

import java.util.Scanner;

public class CheckScanner {
	
	public String scannerMethod()
	{
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		System.out.println(s);
		String s1=scn.nextLine();
		return s1;
		
	}

}
