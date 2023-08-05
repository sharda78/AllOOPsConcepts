package com.AbstractionAssignments;

abstract class Equipment
{
	public abstract void mix();
	public void fill()
	{
		System.out.println("Fill Method In Equipment Class (Concret Method)");
	}
}
class Cement_mixer extends Equipment
{
	@Override
	public void mix()
	{
		System.out.println("Mix Method in Cement_mixer Sub-Class (Overriden Method)");
	}
	public void pour()
	{
		System.out.println("Pour Method in Cement_mixer Sub-Class (Concret Method)");
	}
}

public class EquipmentInfo 
{

	public static void main(String[] args)
	{
		//an object of type Cement_mixer and call its fill ,mix,pour methods.
		Cement_mixer cm = new Cement_mixer();
		cm.mix();
		cm.pour();
		cm.fill();
		System.out.println("----------------------------------------------");
		
		// an obj of type Cement_mixer with reference variable Equipment
		Equipment e = new Cement_mixer();
		e.mix();
		//e.pour();
		e.fill();

	}

}
