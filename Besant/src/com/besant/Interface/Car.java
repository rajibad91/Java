package com.besant.Interface;

public interface Car {

int wheels=4;
public abstract void start();
  void stop();
  
  public default void methodName()
  {
	  System.out.println("Default Method");
  }
}
