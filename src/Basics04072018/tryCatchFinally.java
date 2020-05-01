package Basics04072018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class tryCatchFinally {
	
	/*
	 * try{
	 * }catch(<exception name> e){
	 * 
	 * }finally{ //this is optional block 
	 * Will get executed irrespective of exceptions
	 * }
	 * 
	 */
	int i = 20;
	public void access(){
		try {
			//create the file on the specified path in your system
			FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Sample.txt");
			System.out.println("File Exist in local drive");
			
			i = i/0;
			System.out.println("Validation of arithmetic operators");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}catch(Exception e){
			System.out.println("Arithmetic excpetion found ");
			e.printStackTrace();
			
			i=i/2;
			System.out.println("Evaluation of i is: " + i);
		}finally{	
			int a = 200; 
			int b = 300;
			
			System.out.println("Value of addition is : " + (a+b));
			System.out.println("Value of multiplication is : " + (a*b));
			System.out.println("Value of subtraction is : " + (a-b));
			System.out.println("Value of division is : " + (a/b));
		}
		
	}
	
	public static void main(String[] args) {
		tryCatchFinally ob = new tryCatchFinally();
		ob.access();
	}

}
