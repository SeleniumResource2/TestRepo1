package Basics04072018;

public class MethodWithArgument {
	
	public void addition(){ //method without argument
		int a = 200;
		int b = 300;
		int c = a+b;
		System.out.println("Value of addition is : " + c);
	}
	
	public void subtraction(int a, int b){//Method with argument
		int c = a-b;
		System.out.println("Value of subtraction is : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithArgument ob = new MethodWithArgument();
		ob.addition();
		ob.subtraction(340, 213);
	}

}
