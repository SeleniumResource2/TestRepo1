package Basics;

public class StringRelated {
	
	//String, String Buffer, String Builder ==> implements charsequence(interface)
	//to compare the string we have three methods==> .equals, ==operator, .equalsIgnoreCase, compareTo
//compareTo method will provide integer values s1==s2 (0) s1>s2(positive) s1< s2( negative)
	//For concatenation we use + operator and .concat()
	public void StringMethodsEx(){
		String s1 = "Chitra";
		
		String s2 = "Chitra";
		
		String s3 = "Deepa";
		
		s1 = s1.concat(s3);
		//in jvm==> String s1 = (new StringBuilder()).append(s1).append(s3).toString()
		System.out.println(s1);
		String ss = 20+20+"chitra" + 40+20;
		System.out.println(ss);
		
		System.out.println("When string is same " + s1.compareTo(s2));
		System.out.println("When string is greater than the other " + s1.compareTo(s3));
		System.out.println("When string is less than the other " + s3.compareTo(s1));
		
		String aa = "JavaSession";
		System.out.println(aa.substring(0, 4));
		System.out.println(aa.substring(4));//session
		//Stratindex - inclusive EndIndex - Exclusive
		
		System.out.println(aa.toUpperCase());
		System.out.println(aa.toLowerCase());
		
		//Startswith and end with will provide boolean results
		System.out.println(aa.startsWith("Ja"));
		System.out.println(aa.endsWith("on"));
		
		System.out.println("To provide the length of the string : " + aa.length());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRelated ob = new StringRelated();
		ob.StringMethodsEx();
	}

}
