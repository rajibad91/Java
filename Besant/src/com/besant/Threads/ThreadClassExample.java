package com.besant.Threads;

public class ThreadClassExample extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("inside ThreadClassExample");
		System.out.println(printNumber());
	}
	
	public synchronized int printNumber()
	{
		int i =0;
		try {
			System.out.println("Before Sleep");
			Thread.sleep(1800);
			//wait(1800);
			System.out.println("after Sleep");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i+1;
		
	}

}
