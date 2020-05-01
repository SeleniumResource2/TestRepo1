package Basics;

public class StringComparison {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//.equals, .equalsIgnoreCase, ==
		
		String s1 = "Hinduism"; //literal
		Thread.sleep(5000);
		
		String s2 = "Hinduism"; //literal
		
		String s3 = "Christianity"; //literal
		
		String s4 = new String("Hinduism"); //new keyword
		
		String s5 = "HINDUISM";
		
		//.equals it always compares the content
		System.out.println(s1.equals(s2)); //true ==> constant pool
		System.out.println(s1.equals(s3)); //false ==> constant pool
		System.out.println(s1.equals(s4)); //true ==> non-constantpool
		//compares the address of object
		System.out.println(s1==s2); // true
		System.out.println(s1==s3); // false
		System.out.println(s1==s4); // false
		
		System.out.println(s1.equalsIgnoreCase(s5));//true
		System.out.println(s1.equals(s5));//false

	}

}
