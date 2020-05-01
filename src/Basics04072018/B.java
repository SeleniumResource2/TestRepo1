package Basics04072018;

public class B {//Class within same package
	
	public static void main(String[] args) {
		A ob = new A();
		//ob.msg(); //private modifer method is not accessible on another class
		
		ob.DefaultMsg(); //Default access modifer for a method is accessible on another class 
		
		ob.ProtectedMsg(); //Protected modifier is accessible on another class
		
		ob.PublicMsg(); //Public modifier is accessible on another class
	}

}
