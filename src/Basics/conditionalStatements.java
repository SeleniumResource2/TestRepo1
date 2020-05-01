package Basics;

public class conditionalStatements {
	
	//if, if else if, Nested if , switch 
	
	int a = 200;
	int b = 300;
	int c = 200;
	
	public void ifEx(){
		/*if (condition){
		 * if condition is true then this block will get executed
		 * }
		*/
		
		
		if (a<b){ //true
			System.out.println("a is not greater");
		} //condtion block will get executed
		
		if (a>b){ //false
			System.out.println("A is greater");
		} // condition block will not get executed
		
		
	}
	
	public static void main(String[] args) {
		conditionalStatements ob = new conditionalStatements();
		ob.ifEx();
	}

}
