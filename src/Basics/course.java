package Basics;

public class course {
	
	//Overriding is one of the oops concept in Java
	//Should have same method
	//overriding is acquired with help of inheritance
	//Polymorphism -> Method overloading and overriding. It takes many forms
	
	
	public void coursedet(int No_of_student, String cou1){
		
		int discount = 5;
		int fee = 10000;
		
		if (No_of_student>5){
			int totfee = (fee*No_of_student)*discount/100;
			System.out.println("Total fee acquired " + totfee);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//<Parent class> <object name> = new <parent class>()/<SubClass>()
	}

}
