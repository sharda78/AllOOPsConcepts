package com.Inheritance;

class Bankings{
	
	public void doTransaction() {
		System.out.println("transaction by bank parent class");
	}
}

class OnlineBanking extends Bankings{
	
	public void doTransaction() {
		//super.doTransaction();
		System.out.println("transaction by bank online child class");
		super.doTransaction();
	}
}
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineBanking ob=new OnlineBanking();
		ob.doTransaction();
	}


}
