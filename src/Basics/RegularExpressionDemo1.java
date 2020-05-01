package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p =Pattern.compile("\\W");
		Matcher m = p.matcher("ch2 @3vg!");
		
		while(m.find()){
			System.out.println(m.start()+ "===>" + m.group());
		}
		
	}

}
/**
 * 1. \\s ==> searching only for space
 * 2. \\S==> Except space search would be done for any character
 * 3. \\d==> Search for only digits [0-9]
 * 4. \\D==> Search for any characters except digits
 * 5. \\w==> search for alphanumeric
 * 6. \\W==> Except alphanumeric search for any special character
 * 7. . (dot) ==> Search for all character
 */
