package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		//pattern is a class
		Pattern p = Pattern.compile("y");
		
		Matcher m = p.matcher("xydfxyyxxyxy");//Pattern.compile("XY").matcher("xydfxyyxxyxy");
		
		while(m.find()){
			count++;
			System.out.println(m.start() + "====" + m.end() + "=====>" + m.group());
		}
		
		System.out.println("Number of times the pattern appears : " + count);
	}

}
/**
 * A group of a string where it forms a pattern[similar]
 * 	
 * dfsfsjkflsd@sdfsd.sdf
 * 
 * name:
 * FirstName:
 * 
 * Address:
 * 
 * Mail ID
 * 
 * phone No:
 * 
 * =============================
 * 
 * ctrl c, ctrl v, ctrl f
 * 
 * Pattern class => Compiled version of regular expression/Equivalence to java object of RE
 * 
 * public static pattern compile(String regex) //112/113
 * 
 * Object creation for pattern is done by using compile method in pattern class.
 * 
 * Pattern p = pattern.comile("\\s");
 * 
 * Matcher class: We can use matcher object to match the given pattern in the target string
 * 
 * Matcher object will be created using Matcher method of pattern class
 * 
 * public matcher matcher(String target)
 * 
 * 
 * important methods: 
 * 
 * m.find() //boolean true or false
 * 
 * m.start()/m.end==> integer 
 * 
 * m.group() // string
 * 
 * character class:
 * 
 * "[abc]" ==> a or b or c
 * 
 * "[^abc]" ==> Except a, b ,c
 * 
 * [a-z] ===> any alphabet in lower case
 * 
 * [A-Z] ===> Any alphabet in upper case
 * 
 * [a-zA-Z] ===> Any alphabet irrespect of lower or upper case
 * 
 * [a-zA-Z0-9] ===> AlphaNumeric
 * 
 * [^a-zA-Z0-9] ===> Character which are not alphanumeric [special character]
 * 
 * [0-9] ==> only digits
 * 
 * 
 * 
 */
