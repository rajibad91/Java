package com.besant.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadpool {

	public static void main(String[] args) {
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		for(int i=1;i<=10;i++)
		{
			Thread1 t=new Thread1();
			t.setPropInt(i);
			t.setPropString("String: "+i);
			service.execute(t);
		}
		
		service.shutdown();

	}

}
