package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Jenifer");
		list.add("Kishore");
		list.add("Sadhana");
		list.add("lalitha");
		List<String> list1 = new ArrayList<String>();
		list1.add("Kevin");
		list1.add("Kamakshi");
		list1.add("Purshothaman");
		list1.add("Jenifer");
		list1.add("lalitha");
		list.addAll(list1);
		
		list.removeAll(list1);
		
		list1.add(1, "Saranya");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
