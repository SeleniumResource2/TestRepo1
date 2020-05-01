package Java0808;//package declaration

//import 
import java.io.Console;
import java.io.*;

public class SampleStructure {//Class declaration
	
	
	public void addition(){//user defined method
		int a = 200; int b = 300;
		int c = a+b;
		System.out.println("Value of addition is : " + c);
	}
	
	
	public static void main(String[] args) {//Main method
		
		//reference or object or instance 
		//<classname> <objectname> = new <Classname>();
		SampleStructure obj = new SampleStructure();
		//By taking obj as reference for the class "SampleStructure" , we can access all the method inside the class "SampleStructure"
		
		obj.addition();
	}

}
