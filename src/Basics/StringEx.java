package Basics;

import org.omg.Messaging.SyncScopeHelper;

public class StringEx {
	
	public static void main(String[] args) {
		
	//Literal way of creation of string
	String s1 = "Hope";
	String s2 = "Tutors";
	String s3 = "Hope";
	
	/* String is a class
	 * String is immutable
	 * String it is a sequence of charachters
	 * 
	 * String can be created in two ways:
	 * 1. in literal way
	 * 2. Using the new keyword
	 * 
	 */
	
	char[] ch = {'C', 'h','i', 't','r','a'};
	
	//Using new keyword
	
	String s5 = new String(ch);
	String s6 = new String("Java");
	String s7 = new String(ch);
	
	System.out.println(s5);
	
	String s = "Hope";
	String s11 = "Tutors";
	String result = s.concat(s11);
	System.out.println(s);//hope
	System.out.println(s11);//tutors
	System.out.println();
	
	//String has two more class which is utilized for implementation: String builder and String buffer
	//String comaprison
	// .equals, .equalsIgnorecase //==operator ==>boolean result will be provided
	
	String s111= "Java";
	String s222= "Java";
	String s333 = "VisualBasic";
	String s444 = new String(s111);
	String s555 = "java";
	
	System.out.println("With equals method: " + s111.equals(s222));
	System.out.println("With equals operator: " + s111==s222);
	System.out.println(s444);
	System.out.println(s111.equals(s444));//true
	System.out.println(s111.equals(s333));//false
	System.out.println(s111.equals(s555));
	System.out.println(s111.equalsIgnoreCase(s555));
	}
}

//String value = "4123JavaSession";