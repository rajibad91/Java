package com.besant.AbstractClass;

public abstract class Server {
	
	public Server()
	{
		System.out.println("Constructor of Abstract class");
	}

	public abstract void start();
	public abstract void stop();
	public void getHardDiscDetails()
	{
		System.out.println("Hard DIsc size is 320 GB");
	}
	public static void staticMethod()
	{
		System.out.println("Static method of Abstract class");
	}
}
