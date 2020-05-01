package Basics04072018;

public class InheritanceEx {//Parent class
	
	/*Inheritance is one of the oops concept. 
	 *Sub-Class/Child Class tries to acquire the property of Super Class/Parent class 
	 *Inheritance will be achieved by the keyword "extends" 
	 */

	int a = 211;
	int b = 300;
	
	public void addition(){
		
		int c = a+b;
		System.out.println("Value of addition is : " + c);
	}
	
	public InheritanceEx(){ //Default constructor of parent class
		System.out.println("Super class constructor");
	}
	
	public static void main(String[] args) {
		InheritanceEx ob = new InheritanceEx();
		ob.addition();
	}
}
