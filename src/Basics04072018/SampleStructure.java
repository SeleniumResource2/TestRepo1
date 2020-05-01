package Basics04072018; //package declaration

import java.io.Console;//import statement

public class SampleStructure {//class declaration
	
	//Method declaration
	public void addition(){//user defined 
		int a = 200;
		int b = 345;
		int c = a+b; //manipulated value get stored in variable c
		System.out.println("Addition result is : " + c);
	}
	
	public static void main(String[] args) { //main method 
		
		//object defenition, instance or reference variable
		//<classname> <objectname> = new <ClassName>();
		//object name can be of any meaning ful name
		//object name ob is created for SampleStructure-class and By using the object name ob, trying to access the method in the class SampleStructure 
		SampleStructure ob = new SampleStructure();
		
		ob.addition();
	
	}
}
