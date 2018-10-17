package com.besant.Interface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new SmallCar();
		car.start();
		car.stop();
		car.methodName();
		
		 car=new SedanCar();
		car.start();
		car.stop();
		car.methodName();

	}

}
