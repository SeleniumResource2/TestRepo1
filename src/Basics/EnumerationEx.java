package Basics;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enumeration En;//Declaration of enumeration
		
		Vector weekdays= new Vector();
		
		weekdays.add("NewYear");
		weekdays.add("GandhiJayanthi");
		weekdays.add("Christmas");
		
		En=weekdays.elements();
		
		while(En.hasMoreElements()){
			System.out.println(En.nextElement());
		}

	}

}
