package com.besant.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {
	public void readFile() throws IOException
	{
		
		try(FileInputStream stream=new FileInputStream("C:\\Personal_JAVA\\Besant\\bin\\com\\besant\\file.txt");)
		{
			
			while(stream.read()!=-1)
			{
				System.out.println(stream.read());
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs : Catch block executed");
		}
		finally
		{
			//stream.close();
			System.out.println("Finally Block");
		}
	}

}
