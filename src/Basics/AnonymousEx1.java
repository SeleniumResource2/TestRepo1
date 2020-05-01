package Basics;

public class AnonymousEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousEx ob = new AnonymousEx(){

			@Override
			public void msg() {
				// TODO Auto-generated method stub
				System.out.println("Implementation for abstract method");
			}
			
		};
		
		ob.msg();
	}

}
