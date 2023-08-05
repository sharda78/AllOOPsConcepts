package com.MethodAndStaticAssignment;
/*
    Create a class Car with String model and inttotalCarSold as 
	static variable in main() method.  
	
	Change the value of variable by class name then Print it.
	
	Create two object of Car class and change value of static variable 
	by 1st object and print it by accessing 2nd object.
	
	Check following variations:
	Static variable and Non-Static (Instance Variable) – Just declare and print it.
	See if you can access static variable in static method
	non static variable in static method...no
	then static variable in non-static method....yes
	non static variable in non-static method ...yes
	Note: non static means instance variable
 */
public class CarAssign {
	static String model;
	static int totalCarSold;
	 int price = 12500;
	 
	 public void display()
	 {
		 System.out.println(model + " " + price);
	 }
	public static void main(String[] args) {
		CarAssign c1 = new CarAssign();
		CarAssign c2 = new CarAssign();
		c1.model = "400";
		c1.totalCarSold = 500;
		System.out.println(c2.model + " " + c2.totalCarSold);
		//System.out.println("Instance Variable: " + price);
		System.out.println(CarAssign.model = "300");

		c1.display();
	}

}
