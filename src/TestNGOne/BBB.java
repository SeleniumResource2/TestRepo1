package TestNGOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BBB {

	
	@Test(groups={"regression"})
	public void English(){
		System.out.println("Sounds to be professional");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups={"Sanity", "smoke"})
	public void Tamil(){
		System.out.println("Fertilize the nativity");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups={"regression"})
	public void Malayalam(){
		System.out.println("Origin of Tamil Language");
		System.out.println(Thread.currentThread().getId());
	}

}
