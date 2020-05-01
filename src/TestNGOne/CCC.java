package TestNGOne;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CCC {
	
	@Test
	public void increment() {
		int a =11;
		a= a++;
		int b =12;
		b = b++;
		int c = a + b + a + b;
		System.out.println("Value of addition post increment : " + c);
		System.out.println(Thread.currentThread().getId());
	}

}
