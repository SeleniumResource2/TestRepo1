package Basics;

public class FirstClassEx1 {
	
	public void msg(){
			class Second{
				public void msg1(){
					System.out.println("Accessing the local inner class from FirstClass-Method");
				}
				
		}
			
			Second ob = new Second();
			ob.msg1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClassEx1 ob1 = new FirstClassEx1();
		ob1.msg();
	}

}
