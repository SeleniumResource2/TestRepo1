package Basics04072018;

public class MethodWithReturn {
	
	//in method if void keyword is present then there is no return
	//in method if void keyword is absent then there is a return
	
	public void addition(){ //method without return
		int a = 200;
		int b = 300;
		int c = a+b;
		System.out.println("Value of addition is : " + c);
	}
	
	public static double subtraction(){//Method with return and serves the purpose when the transaction is not constant
		//return data type should always be the same as the method - data type
		 double a = 23.43;
		 double b = 10.12;
		 double c = a-b;
		System.out.println("Result is : " + c);
		return c;
		
	}
	
	public static void AllOperator(){
		System.out.println("=====================================");
		double d = subtraction();//taken the method with return as an input for another manipulation
		double e = d+100.12;
		System.out.println("Value of all Operators : " + e);
	}
	
	public static void main(String[] args) {
		MethodWithReturn ob = new MethodWithReturn();
		ob.addition();
		ob.subtraction();
		//System.out.println("Value of subtraction is : " + ob.subtraction());
		ob.AllOperator();
	}
}
