package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher m = p.matcher("917840030452");
		
		if (m.find()){
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid mobile number");
		}

	}

}
