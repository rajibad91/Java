package com.besant.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheckBufferStream {
	
	public void bufferWriterStream()
	{
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Personal_JAVA\\JAVA\\COREJAVA\\FILE\\NewDocBuffer.txt"));
			bw.write(new CheckScanner().scannerMethod());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
