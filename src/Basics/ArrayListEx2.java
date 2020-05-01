package Basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseApplied CA1 = new CourseApplied(101, "Karthick", 21);
		CourseApplied CA2 = new CourseApplied(102, "Hema", 16);
		CourseApplied CA3 = new CourseApplied(103, "Bargavi", 18);
		
		ArrayList<CourseApplied> AL = new ArrayList<CourseApplied>();
		
		AL.add(CA1);
		AL.add(CA2);
		AL.add(CA3);
		
		Iterator itr = AL.iterator();
		
		while(itr.hasNext()){
			CourseApplied cou = (CourseApplied)itr.next();
			
			System.out.println(cou.rollno + " " + cou.name + " " + cou.age);
		}
		
	}

	//For Linked list declaration==>LinkedList<String> llist = new LinkedList<String>();
	}


