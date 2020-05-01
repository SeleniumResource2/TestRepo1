package Basics;

public class StringRelated3 {

	//valueOf
	
	public void display(){
		int value=30;
		String s1 = String.valueOf(value);
		System.out.println(200+200+s1+100);
		
		//getchars
		
		char[] ch = new char[15];
		
		String str = new String("Hey HopeTutors welcomes you");
		str.getChars(4, 14, ch, 0);
		System.out.println(ch);
		
		String s2 = "    Welcome Team        ";
		System.out.println(s2);
		
		s2=s2.trim();
		
		System.out.println(s2);
		
	}
	
	public static void main(String[] args) {
		new StringRelated3().display(); //also known as nameless object
	}
}
