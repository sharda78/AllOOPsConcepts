package com.AbstractionAssignments;
// if we can't make abstract method so that we have an error in c.room(); because 
// the method room() is undefined for closet class(abstract);.
abstract class Closet
{
	String name;
	public abstract void room();
	Closet(String name)
	{
		this.name = name;
	}
	
}
class People extends Closet
{
	People()
	{
		super("Closet");
	}
	@Override
	public void room()
	{
		System.out.println( name + " can be accessed only in People Sub-Class");
	}
}
public class PeopleInfo {

	public static void main(String[] args) {
		Closet c= new People();
		c.room();

	}

}