package com.Polymorphism;


/* static mth cannot overriden
Can we override a static method?
No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time. So, we cannot override static methods.

If we call a static method by using the parent class object, the original static method will be called from the parent class.
If we call a static method by using the child class object, the static method of the child class will be called.

Can we override Main() ?
No, we cannot override main method of java because a static method cannot be overridden.
The static method in java is associated with class(bounded at compile time) whereas,
 the non-static method is associated with an object(at run time).
 
 hide the another static mtd in overriden
 
 */
class Flower
{
	public static void fragnance()
	{
		System.out.println("Flower Class");
	}
}
class Lotus extends Flower
{
	public static void fragnance()
	{
		System.out.println("Lotus Class");
	}
}
public class StaticWithOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f = new Lotus();
		f.fragnance();
		

	}

}
