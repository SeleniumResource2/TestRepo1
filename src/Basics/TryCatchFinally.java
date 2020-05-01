package Basics;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int a = 300/0;
			System.out.println("Value of a is " + a);
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally{
			System.out.println("Irrespective of exception Finally block code has to be executed");
		}

	}

}
