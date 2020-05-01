package Basics;

public class StringRelated1 {
	
	public void display(){
		String a1 = new String("Selenium");
		String a2 = "Selenium";
		
		System.out.println(a1==a2);
		String a3 = a1.intern();
		System.out.println(a3==a2);
		
		String s1 = "Java is simple and easy to learn. Java is one of the base language for selenium tool. Apart from Java there are other languages also";
		
		String reEX = s1.replace("Java", "python");
		
		System.out.println(reEX);
		
		StringBuffer sb = new StringBuffer("Harish");
		sb.append("Kirshna");
		System.out.println("Buffered string " + sb);

		StringBuilder sb1 = new StringBuilder("Harish");
		sb1.append("Kirshna");
		System.out.println("Builder string " + sb1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringRelated1().display(); 
	}

}
