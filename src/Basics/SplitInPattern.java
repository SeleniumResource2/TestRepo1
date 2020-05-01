package Basics;

import java.util.regex.Pattern;

public class SplitInPattern {
	
	public void Display1(){
		Pattern p =Pattern.compile("t");
		String[] s =p.split("Tata Consultancy Services");
		
		for(String s1: s){
			System.out.println(s1);
		}
	}
	
	public void Display2(){
		Pattern p1 =Pattern.compile("\\.");
		String[] s1 =p1.split("www.majesco.com");
		
		for(String s2: s1){
			System.out.println(s2);
		}
	}
	
		
	public static void main(String[] args) {
		new SplitInPattern().Display2();
	
	
}
}
/**
 * Tata
 * Consultancy 
 * Services
 */
