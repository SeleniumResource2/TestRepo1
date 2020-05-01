package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class tryCatchEx {
	
	public void Access(){
		//Compile time exception
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\abcd123sfsdf.txt");
		
		System.out.println("Validation of files....");
		//compile time exception
		
		Thread.sleep(1000);
	
		System.out.println("Validation of pausing the execution...");
		//Run time exception
		int b = 20;
		
		b = b/0;
		
		System.out.println("Validation of Arithmetic...");
		
		//Run time exception
		
		int[] a= new int[2];
		a[0] = 21;
		a[1] = 23;
		
		
		System.out.println("value of a is : " + a[2]);
	
		System.out.println("Accessing array values....");
	}  catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}  catch (InterruptedException e){
		System.out.println(e.getMessage());
	}  catch (ArithmeticException e){
		System.out.println(e.getMessage());
	} 	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		System.out.println("Transaction at finally block executed irrespective of exceptions");
		int a = 200;
		int b = 300;
		System.out.println("Value of manipulation is : " + (a+b));
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tryCatchEx ob = new tryCatchEx();
		ob.Access();

	}

}
