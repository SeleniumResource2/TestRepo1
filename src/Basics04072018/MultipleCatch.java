package Basics04072018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatch {
	
	public void display() {
		try {
			String Path = "C:\\Users\\manju\\Desktop\\Sample1.txt";
			FileInputStream fis = new FileInputStream(Path);//Compile time exception
			System.out.println("File exist....");
			Thread.sleep(5000);//Compile time exception
			int a = 20/2; //Run-time Exception
			System.out.println("Validation of operator ==> Addition");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			int a = 200+400;
			System.out.println("Value of addition is : " + a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		MultipleCatch ob = new MultipleCatch();
		ob.display();
	}
}
