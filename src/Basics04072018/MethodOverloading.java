package Basics04072018;

public class MethodOverloading {
	/*
	 * Next OOPs Concept is Polymorphism which is the combination of both Method Overloading and Method Overriding
	 * Poly --> means Many Morphism --> means different forms
	 * Trying to take different forms
	 * 
	 * Method Overloading: Having same method name and providing variation on Arguments
	 * 
	 */

	public void marks(int M1){
		System.out.println("Mark of single Quarter : " + M1);
	}
	
	public void marks(int M1, int M2){
		
		System.out.println("Total Mark of two Quarter: " + (M1+M2));
	}
	
	public void marks(int M1, int M2, int M3){

		System.out.println("Total marks of Three Quarter : " + (M1+M2+M3));
	}
	
	public void marks(int Total, String Name){
		int Average = Total/5;
		System.out.println("Average score is : " + Average + " By Student " + Name);
	}
	
	public void marks(String name, boolean distinction){
		System.out.println("Name of the candidate is : " + name);
		System.out.println("Category of Distinction is : " + distinction);
	}
	
	public static void main(String[] args) {
		MethodOverloading ob = new MethodOverloading();
		ob.marks(98);
		ob.marks(485, "Sireesha");
		ob.marks("Praveen", true);
		ob.marks(98, 75);
		ob.marks(98, 67, 86);
	}
	
	
}
