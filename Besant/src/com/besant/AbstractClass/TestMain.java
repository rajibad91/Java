package com.besant.AbstractClass;

public class TestMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Server server=new WindowsServer();
		server.start();
		server.stop();
		Server.staticMethod();
		server.staticMethod();

	}

}
