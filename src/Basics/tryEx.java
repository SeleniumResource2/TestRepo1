package Basics;

public class tryEx {
	
	/**
	 * try{
	 * code that may throw an exception
	 * } catch(Exception class referenece){
	 * }
	 * 
	 * try{
	 * code that may throw an exception
	 * } finally{
	 * }
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		

		try {
			int i = 100/0;
			int[] a = {21, 22, 34};
			
			System.out.println("Value of a is " + a[6]);
		} catch (ArithmeticException e) {
			
			System.out.println("Exception found in Array " + e.getMessage());
		} catch (Exception e){
			System.out.println("Exception found in Manipulation " + e.getMessage());
		}
		System.out.println("Execute the code after evaluating value of i");
	}

}
