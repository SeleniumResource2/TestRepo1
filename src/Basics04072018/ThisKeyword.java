package Basics04072018;

public class ThisKeyword {
	//This keyword is used only for the variable or method using in the same class(instance)
	int a; 
	int b;
	
	public void addition(){
		this.subtraction();
		System.out.println("Process of Addition");
		int c = a+b;
		System.out.println("Value of addition is: " + c);
	}
	
	public void subtraction(){
		System.out.println("Process of subtraction");
		int c = a-b;
		System.out.println("Value of subtraction is : " + c);
	}
	
	public ThisKeyword(int a, int b){
		
		 this.a = a;
		 this.b = b;
		 
	}
	

	public static void main(String[] args) {
		ThisKeyword ob = new ThisKeyword(200, 3);
		ob.addition();
	}
}
