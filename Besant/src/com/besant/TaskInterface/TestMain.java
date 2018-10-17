package com.besant.TaskInterface;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Servers window=new Windows();
		window.hardDisc();
		window.start();
		window.stop();

		Servers linux=new Linux();
		linux.hardDisc();
		linux.start();
		linux.stop();
	}

}
