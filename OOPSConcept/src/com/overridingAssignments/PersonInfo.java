package com.overridingAssignments;
class Person
{
	public void readScript()
	{
		System.out.println("readscript method in person class");
	}
}
class Actor extends Person
{
	@Override
	public void readScript()
	{
		System.out.println("readscript method in Actor class");
	}
}
public class PersonInfo {

	public static void main(String[] args) {
		Person p = new Person();
		p.readScript();
		
		p = new Actor();
		p.readScript();

	}

}
