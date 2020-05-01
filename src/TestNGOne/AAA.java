package TestNGOne;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AAA {
	

	int a = 200;
	int b = 2;



	@Test(groups={"Sanity"})
	public void subtract() {
		int c = a - b;
		System.out.println("Value of subtraction is : " + c);
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups={"smoke"})
	public void add() {
		int c = a + b;
		System.out.println("Value of addittion :" + c);
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups={"regression"})
	public void multiply() {
		int c = a * b;
		System.out.println("Value of multiplication is : " + c);
		System.out.println(Thread.currentThread().getId());
	}

	
	

}
