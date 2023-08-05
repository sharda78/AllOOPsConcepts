package com.Interface;

import java.io.Serializable;

// singal abstract method in interface (SAM)
@FunctionalInterface
interface Washable
{
	void wash(); // abstract method
	default void m1()
	{
		
	}
	
}
@FunctionalInterface
interface A
{
	void m1();
}
//marker interface
class B implements Serializable
{
	
}
public class InterfaceDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 // 5 types of interface
/*
normal interface
extend interface
nested interface
functional interface
marker interface.............

Runnable interface(threading)


*/