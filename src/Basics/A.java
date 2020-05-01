package Basics;

public class A {
	
	int c;
	
	void addition(){
		
		int a = 200;
		int b = 300;
		
		c = a+b;
		
		System.out.println("Value of c on addition is : " + c);
		
	}
	
	
	void display(){
		
		String a = "Flat_A";
		String b = "Flat_B";
		
		System.out.println("Total accomodation in " + a + " and " + b + " is " + c);

	}
	
	public A(){
		System.out.println("Initiation of parent class constructor");
		System.out.println("Retrieving accomodation at the year of 2018");
	}
	
	public static void main(String[] args) {
		A ob = new A();
		
		ob.addition();
		ob.display();
		
	}
	
	

}
