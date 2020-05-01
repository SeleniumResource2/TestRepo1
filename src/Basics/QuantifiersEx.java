package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pattern p =Pattern.compile("a?");
		Matcher m = p.matcher("abaabaaab");
		
		while(m.find()){
			System.out.println(m.start()+ "===>" + m.group());
		}

	}

}
/**
 * Quantifier is nothing but use to specify the number of occurrences
 * 
 * a ==> exactly one a
 * a+ ==> Atleast one a
 * a* ==> Any number of a including zero number of a
 * a? ==> atmost one a or zero number of a
 * 
 */
