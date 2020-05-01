package JunitP;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AAA {

	int a = 200;
	int b = 2;

	@Before
	public void Manipualation() {
		System.out.println("manipulation of MATH ==>");
		
	}
	
	@After
	public void logOut(){
		System.out.println("Logging out of the browser****");
	}

	@Test
	public void subtract() {
		int c = a - b;
		System.out.println("Value of subtraction is : " + c);
	}

	@Ignore
	public void add() {
		int c = a + b;
		System.out.println("Value of addittion :" + c);
	}

	@Test
	public void multiply() {
		int c = a * b;
		System.out.println("Value of multiplication is : " + c);
	}

	@Test
	public void division() {
		int c = a / b;
		System.out.println("Value of division is :" + c);
	}

	@Test
	public void increment() {
		a = a++;
		b = b++;
		int c = a + b + a + b;
		System.out.println("Value of addition post increment : " + c);
	}

}
