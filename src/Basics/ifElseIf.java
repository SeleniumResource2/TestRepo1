package Basics;

public class ifElseIf {
	
	/*if(condition true){
	 * True block
	 * } else if(condition){
	 * True block
	 * } else if (condition){
	 * 
	 * } else {
	 * 
	 * }
	 * 
	 */
	
	static int a = 200, b = 200, c=400;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (a> b){//false
			System.out.println("A is greater");
		} else if (a==b){
			System.out.println( " A and b are equal");
		} else if(c < a){
			System.out.println("C is not greater");
		} else {
			System.out.println(" Try with other data");
		}
		
	}

}
