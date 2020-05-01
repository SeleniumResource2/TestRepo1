package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("");
		Matcher m = p.matcher("x8u@d%68f");
	/*	
		//Bill no: 141, 142 ==149 ===>
				
						
						
		//x8u@d%68f==>
						
		//DD-MM-YYYY==>	
		
		
		[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
		[7-9][0-9]{9}
		0?[789][0-9]{9}
		(91)?[789][0-9]{9}
		(0|91)?[789][0-9]{9}
		
		[a-zA-Z0-9][.][0-9a-zA-Z0-9]@[a-z]+[.][a-z]+
		
		===>Name that starts and ends with a/A
		
		[aA][a-zA-z]*[aA]*/
				
		
	}
	

}
