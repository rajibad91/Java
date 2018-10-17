package mCQ;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Assume extends Thread {

	private int a;
	private int b;
	static Thread a2;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Assume a1=new Assume();
		a1.start();
		a2= Thread.currentThread();
		//Thread.sleep(1000);
		a1.a=50;
		a1.b=60;
		System.out.println(a1.a+" "+a1.b);
		
		System.out.println(1/0);

	}
	
	public void run()
	{
		try {
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		set(10,20);
		System.out.println(read());
		
	}
	public int read()
	{
		return a+b;
	}
	public void set(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

}
