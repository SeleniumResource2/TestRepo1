package Basics;

public class StaticExample {
	
	static class inner{
		public void msg(){
			System.out.println("Accessing method from static inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.inner ob =new StaticExample.inner();
		ob.msg();
	}

}
