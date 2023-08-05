package com.Inheritance;
class Technology
{
	void code()
	{
		System.out.println("Writing Code...");
	}
}
class Java extends Technology
{
	void error()
	{
		System.out.println("Error...");
	}
}
public class SingalInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java j = new Java();
		j.code();
		j.error();


	}

}
