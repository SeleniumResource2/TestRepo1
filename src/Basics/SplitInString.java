package Basics;

public class SplitInString {
	
	public static void main(String[] args) {
		
		String s = "Vega Soft Solutions";
		
		String[] s1 = s.split("o");
		
		for (String s2:s1){
			System.out.println(s2);
		}
	}

}
//Pattern is treated as argument in split method of parent class - String


//Target string is treated as an argument in split method of parent class-pattern