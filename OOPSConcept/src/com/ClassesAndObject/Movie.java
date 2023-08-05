package com.ClassesAndObject;

public class Movie {
	String m_name="RRR";
	float price=300.0f;
	float rating=7.8f;
	
	
//	void accept(String m,float p,float r)
//	{
//		m_name=m;
//		price=p;
//		rating=r;
//	}
	
	void display()
	{
		System.out.println("movie name is.."+m_name);
		System.out.println("movie price is.."+price);
		System.out.println("movie rating is.."+rating);
		
	}
	
	float getPrice() {
		return price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie m = new Movie();
		
		System.out.println(m + "\n");
		
		//m.accept("RRR", 300.00f, 6.7f);
		m.display();



	}

}
