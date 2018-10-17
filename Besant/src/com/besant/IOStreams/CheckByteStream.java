package com.besant.IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckByteStream {
	
	public void byteStream()
	{
		FileInputStream in = null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("C:\\Personal_JAVA\\JAVA\\COREJAVA\\FILE\\Doc.txt");
			out=new FileOutputStream("C:\\Personal_JAVA\\JAVA\\COREJAVA\\FILE\\NewDoc.txt");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
