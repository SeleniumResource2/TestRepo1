package Basics;

public class ThrowEx {
	
	static void display(int a){
		if(a>20){
		throw new ArithmeticException("Invalid");
		} else{
			System.out.println("Continue Manipulation");
		}
	}
	
	public static void main(String[] args) {
		display(22);
		System.out.println("Execution happened");
	}

}
