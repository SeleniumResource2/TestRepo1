package Basics;

public abstract class AbstractEx {
	
	public void Engine(){ // concrete method
		System.out.println("Warranty for engine is 2 years");
	}
	
	public abstract void Fuel(); // abstract method
		
	public void handle(){
		System.out.println("Two handles should be with proper grip ");
	}
	
	public abstract void seater(); //Abstract method
		
	
	public static void main(String[] args) {
		AbstractEx ob = new AbstractExSub();//overriding concept
		ob.Engine();
		ob.Fuel();
		ob.handle();
		ob.seater();
	}
	

	
}

//A method that has block is called concrete method 100% -> Java class
//one or two abstract method 50% -> Abstract class
//in Abstract class object cannot be created
//By utilizing the keyword, extends we can create object. Also this can be achieved only when we define the abstract method
//sub -class -> extends -> parent class 
//java class to java class we can use extends key word
//abstract class to java class we can use extends key word
// Hiding the implementation details and defining the functionality 