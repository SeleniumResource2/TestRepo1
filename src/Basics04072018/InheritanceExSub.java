package Basics04072018;

public class InheritanceExSub extends InheritanceEx{//Child class
	
	public void increment(){
		super.addition(); //Method of parent class is accessible only by using super keyword
		int a = super.a; //variable of parent class is accessible only by using super keyword
		a++;
		System.out.println("Value of a post increment : " + a);
		
	}
	
	public InheritanceExSub(){ //Default constructor of sub-class
		System.out.println("Sub-Class constructor");
	}
	
	public static void main(String[] args) {
		InheritanceExSub obs = new InheritanceExSub();
		obs.addition();
		System.out.println("Below called methods have accessibility for super class variable and method");
		System.out.println("===========================================================================");
		obs.increment();
		
	}

}
