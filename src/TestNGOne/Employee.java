package TestNGOne;

import org.testng.annotations.Test;

public class Employee {
	
	@Test(groups={"regression", "Sanity"})
	public void test1(){
		System.out.println("Test1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups={"Sanity"})
	public void test2(){
		System.out.println("Test2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups={"smoke"})
	public void test3(){
		System.out.println("Test3");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups={"smoke"})
	public void test4(){
		System.out.println("Test4");
		System.out.println(Thread.currentThread().getId());
	}
}
