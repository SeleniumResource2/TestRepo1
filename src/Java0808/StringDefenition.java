package Java0808;

public class StringDefenition {
	//String is immutable class
	public void access(){
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "JAVA";
		String s4 = new String("Java");
		String s5 = new String("OOPS");
		String s6 = "Hadoop";
		
		//==operator
		
		System.out.println("S1==S2===>" + (s1==s2));
		System.out.println("S1==S4===> with new keyword " + (s1==s4));
		System.out.println("                                  ");
		//equals method (compares only the literal
		System.out.println("s1.equals(s2)====>" + s1.equals(s2)); //true
		System.out.println("s1.equals(s4)====>" + s1.equals(s4)); //true
		System.out.println("S2.equals(s3)====>" + s2.equals(s3)); //false
		System.out.println("S2.equals(s6)====>" + s2.equals(s6)); //false
		System.out.println("S4.equals(s5)====>" + s4.equals(s5)); //false
		System.out.println("                                  ");
		//equals ignore case
		System.out.println("S2.equals(s3)====>" + s2.equalsIgnoreCase(s3));
		
		//String concatenation:
		
		String fname = "Anitha";
		String lname = "Krishnan";
		fname.concat(lname); //AnithaKrishnan. Unless the string is reinitialized variable will not get stored
		System.out.println(fname);
	}
	
	public void OtherMethods(){
		String s = "Hello";
		//To upper case and to lowercase
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println();
		String s1 = "  Welcome      ";
		System.out.println(s1);
		System.out.println(s1.trim());
		//index always starts from zero. First index is inclusive and last index is exclusive
		System.out.println(s.charAt(3)); //Hello
		//System.out.println(s.charAt(5)); //provides compilation error. String index is only 4
		
		String s3 = "Hi welcome to java world. Selenium uses java";
		System.out.println("Using contains method   " + s3.contains("java"));
		System.out.println("Using substring with begin index =>" + s3.substring(3));
		System.out.println("Using begin and end index =====> " + s3.substring(3, 10));
		System.out.println("To provide each string from group of strings===>");
		
		//To split group of string with space
		String[] ss = s3.split(" ");
		System.out.println(ss); //Returns object
		
		for(int i=0; i<ss.length; i++){
			System.out.println(ss[i]);
		}
		
		System.out.println(s3.replaceAll("java", "Hadoop"));
	}
	
	public static void main(String[] args) {
		StringDefenition ob = new StringDefenition();
		//ob.access();
		ob.OtherMethods();
	}

}
