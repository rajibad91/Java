package com.besant.AbstractClass;

public class WindowsServer extends Server {

	@Override
	public void start() {
		System.out.println("Windows server started");
		
	}

	@Override
	public void stop() {
		System.out.println("Windows server stopped");
		
	}
	
	public static void staticMethod()
	{
		System.out.println("Static Method of Windows Server");
	}

}
