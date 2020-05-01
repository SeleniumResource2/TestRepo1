package Basics;

public class ThreadEx extends Thread{ //Run, Start
	
/*	public void run(){
		for(int i = 0; i<5 ; i++){
			System.out.println("Child Thread");
		}
	}*/
	
	/*public void run(){
		System.out.println("No-arg run");
	}
	
	public void run(int i){
		System.out.println("int-arg run");
	}*/
	
	
	public void start(){
		super.start();
		System.out.println("Start method");
	}
	public void run(){
		System.out.println("Run Method");
	}

}
