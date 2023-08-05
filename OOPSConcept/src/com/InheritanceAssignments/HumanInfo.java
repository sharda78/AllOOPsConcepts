package com.InheritanceAssignments;

class Human
{
	String name,gen;
	public void find()
	{
		System.out.println("is elder");
	}
}
class Woman extends Human
{
	int age;
	Woman(int age)
	{
		this.age = age;
	}
	public void show()
	{
		System.out.println("Woman Age: " + age);
	}
}
class Man extends Human
{
	int age;
	Man(int age, String name,String gen)
	{
		this.age = age;
		this.name = name;
		this.gen = gen;
	}
	public void show()
	{
		System.out.println("Man Age: " + age);
		System.out.println("Human Class Name: " + name);
		System.out.println("Human Class Gender: " + gen);
	}
}
public class HumanInfo {

	public static void main(String[] args) {
		 Man m = new Man(45,"Raj" ,"Male");
		m.show();
		Woman w = new Woman(30);
		w.show();
	}

}

//Define method find() in ‘Human’ to pass objects of ‘Man’ and ‘Woman’. It will find who is elder
