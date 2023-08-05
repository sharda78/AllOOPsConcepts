package com.Abstraction;



abstract class Animal
{
	public String name;
	public Animal(String name)
	{
		this.name= name;
	}
	public abstract void makesound();
	//protected abstract void run();
	//abstract void run();
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
}
class Dog extends Animal
{
	Dog(String name)
	{
	super(name);
	}
	public void makesound()
	{
		System.out.println(name + " bark");
	}
}
class Cat extends Animal
{
	Cat(String name)
	{
		super(name);
	}
	public void makesound()
	{
		System.out.println(name + " meows");
	}
}
public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog("moti");
		a.eat();
		a.makesound();
		System.out.println("---------------------");
		a = new Cat("Luna");
		a.eat();
		a.makesound();
	}

}
