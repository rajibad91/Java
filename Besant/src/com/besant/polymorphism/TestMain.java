package com.besant.polymorphism;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		teach(animal);
	    animal=new Bird();
	    teach(animal);
		animal=new Fish();
		teach(animal);

	}

	public static void teach(Animal animal)
	{
		animal.move();
	}
}
