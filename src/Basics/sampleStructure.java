package Basics;//package declaration

public class sampleStructure {//class declaratoin
	
	public void addition(){//method declaration
		int a = 200;
		int b = 300;
		int c = a+b;
		System.out.println("Value of addition is "+ c);
	}
	
	public static void main(String[] args) {
		//syntax: <class name> <object name> = new <class name>();
		
		sampleStructure obj = new sampleStructure();
		obj.addition();
	}

}
