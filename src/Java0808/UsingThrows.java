package Java0808;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {

	public void access() {
		try {
			try {
				File f = new File("C:\\Users\\manju\\Desktop\\Sample111.txt");

				FileInputStream fis = new FileInputStream(f); // Compile time
																// exception

				System.out.println("file Exist or not" + f.exists());
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			Thread.sleep(1000);
			// Run-Time exception
			try {
				int x = 20;
				x = x / 0;
			} catch (ArithmeticException e) {
				System.out.println("Exception of thread " + e.getMessage());
			}
			System.out.println("Validation of arithmetic operator");
			int a = 200;
			int b = 312;
			int c = a + b;
			System.out.println("Value of addition is " + c);
			System.out.println("Value of subtraction is : " + (a - b));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred");
		}

	}

	public static void main(String[] args) throws Exception {
		UsingThrows ob = new UsingThrows();
		ob.access();
	}

}
