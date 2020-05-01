package Basics;

public class TestThread {

	public static void main(String[] args) { //Main thread
		
		ThreadEx th = new ThreadEx(); //First Thread
		th.start(); //Second Thread
		
		for(int j=0; j<5; j++){
			System.out.println("Main method");
		}
		th.start();

	}

}
