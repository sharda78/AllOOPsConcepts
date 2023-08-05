package com.InterfaceAssignments;
interface Test
{
	void square();
	
}
class Arithematic implements Test
{
	public void square()
	{
		System.out.println("Square method in arithematic class");
	}
}
class ToTestInt implements Test
{
	public void square()
	{
		Arithematic a = new Arithematic();
		a.square();
	}
	
}
public class TestInfo {

	public static void main(String[] args) {
		
		ToTestInt t = new ToTestInt();
		t.square();
	}

}
