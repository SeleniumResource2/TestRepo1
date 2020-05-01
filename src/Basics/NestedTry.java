package Basics;

public class NestedTry {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("===========Arithmetic Manipulation=========");
				
				int i = 40/0;
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			try {
				System.out.println("=================Evaluation of Array============");
				int[] r = {2, 5, 6};
				
				System.out.println("Value of 4th location " + r[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			System.out.println("Execution of other statements");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}
		
		System.out.println("Normal flow has been executed apart from the exceptions");
	}

}

/**try{
 * 
 * st1;
 * st2;
 * 		try{
 * 			st1;
 * 			st2;
 * 			}catch(){}
 * 
 * }catch(){
 * 		}
 * 
 */
