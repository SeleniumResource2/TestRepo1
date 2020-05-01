package Basics;

public class StringRelated2 {
	
	public void display(){
		StringBuffer a = new StringBuffer("ISTQB");
		a.insert(0, "Certification");
		System.out.println("Value of a is" +a);
		
		StringBuffer aa = new StringBuffer("CSTE");
		aa.replace(1, 3, "Certificate");
		System.out.println(aa);
		
		
		aa.delete(1, 3);
		System.out.println(aa);
		
		aa.reverse();
		System.out.println("Reversal of string " + aa);
		
	}
	
	public void display1(){
		StringBuilder a = new StringBuilder("ISTQB");
		a.insert(0, "Certification");
		System.out.println(a);
		
		StringBuilder aa = new StringBuilder("CSTE");
		aa.replace(1, 3, "Certificate");
		System.out.println(aa);
		
		
		aa.delete(1, 3);
		System.out.println(aa);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRelated2 ob = new StringRelated2();
		ob.display();
		ob.display1();
	}

}
