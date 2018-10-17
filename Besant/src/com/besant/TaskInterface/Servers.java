package com.besant.TaskInterface;

public interface Servers {
	void start();
	void stop();
	public default void hardDisc()
	{
		System.out.println("Hard Disc is 320 GB");
	}

}
