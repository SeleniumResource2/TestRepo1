package Basics;

public class TwoDimensional {
	
	//Syntax <Data Type>[][] <ArrayName> = new <DataType>[Size of the element][Size of the element]
	/*
	 * 000
	 * 111
	 * 222
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] Browser = new String[2][3];
		
		Browser[0][0] = "Chrome";
		Browser[0][1] = "Opera";
		Browser[0][2] = "Firefox";
		Browser[1][0] = "Chromium";
		Browser[1][1] = "UC Browser";
		Browser[1][2] = "InternetExplorer";
		
		
		System.out.println("Browser in 1,2 " + Browser[2][4]);
		
		

	}

}
