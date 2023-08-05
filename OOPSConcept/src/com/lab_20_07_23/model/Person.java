package com.lab_20_07_23.model;

public class Person {

	private int id;
	private String name;
	public int age;
	
	public Person()
	{
		System.out.println("Default Constructor");
	}
	public Person(int id)
	{
		this.id=id;
	}
	public Person(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public Person(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	public void display()
	{
		System.out.println("In Parameterized constructor with one argument " + id );
		System.out.println("In Parameterized constructor with two argument " + id + " " + name);
		System.out.println("In Parameterized constructor with one argument " + id + " " + name + " " + age);
		
	}
	public void getId(int id)
	{
		this.id = id;
	}
	public void getName(String name)
	{
		this.name = name;
	}
	public void getAge(int age)
	{
		this.age = age;
	}
	public void setId()
	{
		System.out.println("Id is: " + id);
	}
	public void setName()
	{
		System.out.println("Name is: " + name);
	}
	public void setAge()
	{
		System.out.println("Age is: " + age);
	}
	public String toString()
	{
		System.out.println("toString Method in Person Class");
		return " "; 
	}

}
