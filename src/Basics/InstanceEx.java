package Basics;

public class InstanceEx {
	
	public InstanceEx(){ //Default
		//this(10);
		System.out.println("Constructor is invoked");
	}
	
	public InstanceEx(int a){ //argument constructor
		//this(10, 20);
		System.out.println("Constructor is invoked with one argument");
	}
	
	public InstanceEx(int a, int b){
		System.out.println("Constructor is invoked with two argument");
	}
	
	{//instance block
		
		System.out.println("First Instance will be invoked");
	}
	
	{//instance block
		
		System.out.println("Second Instance will be invoked");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceEx ob = new InstanceEx();
		InstanceEx ob1 = new InstanceEx(20);
		InstanceEx ob2 = new InstanceEx(20, 30);
	}

}
/**5 element in class
 * 1. Variable
 * 2. Methods
 * 3. Constructors ==> Logics created/ Initialization
 * 4. Instance block ===> Logics created/ Initialization
 * 5. Static block
 */
