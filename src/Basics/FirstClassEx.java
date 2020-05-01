package Basics;

public class FirstClassEx {
	
	public class SecondClassEx{
		public void msg(){
			System.out.println("This is method invoked in second class");
		}
	}
	
	public void First(){
		SecondClassEx ob = new SecondClassEx();
		ob.msg();
	}
	
	public static void main(String[] args) {
		FirstClassEx ob1 = new FirstClassEx();
		ob1.First();
	}

}
