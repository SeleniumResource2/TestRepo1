package Java0808;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		String s = "Hi Welcome to Selenium World";
		
		StringTokenizer s1 = new StringTokenizer(s);
		
		//To calculate the length of the string
		int size = s.length();
		
		while(s1.hasMoreTokens()){
			System.out.println(s1.nextToken());
		}
		
		
	}

}
