package com.Interface;
/*
 * Interface is same as a class ,we have to use interface keyword instead of class
 * 
 * Interface variable are by default public ,static,final
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
interface Printable
{
	int num = 10;
	void shownum();   // by default or public
	                  // abstract method do not specify body
//Printable()
//{ 
	
//}

					//we don't have instance variable in interface beaause instance variable in interface are final

					// and final vari must be initilized.
}
class Print implements Printable
{
	@Override
	public void shownum()
	{
		System.out.println("Print Class");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Printable p  = new Print(); //dynamindispatching,upcasting
		p.shownum();
		
		Print p1  = new Print(); //dynamindispatching,upcasting
		p1.shownum();
		

	}

}
