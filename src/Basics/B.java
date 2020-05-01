package Basics;

//inheritance: This is one of the oops concept in java and helps to acquire or inherit the properties of the parent class in sub-class
//Helps to acquire the inheritance with the help of keyword called "extends"
//parent class[Super class/derived class] is A and Child-class[sub-class] is B

// Inheritance , Polymorphism , Abstraction [Interface included] , Encapsulation

public class B extends A{
	
	void increment(){
		int a = 20;
		a++;
		System.out.println("Value of a on increment is " + a);
	}
	
	void decrement(){
		int a = 20;
		a--;
		System.out.println("Value of a on decrement " + a);
	}
	
	public B(){
		System.out.println("Construcotr of sub class is invoked");
	}

	public static void main(String[] args) {
		B ob = new B();
		ob.increment();
		ob.decrement();
		ob.addition();
		ob.display();
	}
}
