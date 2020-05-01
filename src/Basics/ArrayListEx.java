package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		List ob = new ArrayList();
		ob.add("Siva");
		int s =   ob.get(0);*/
		
		List<String> ob1 = new ArrayList<String>(); //Declaration of array list
		//to add elements to list
		ob1.add("Ravi");
		ob1.add("Raja");
		ob1.add("Rani");
		ob1.add("Sindhu");
		//To fetch a sepcific element then we need to provide index
		String ss = ob1.get(2);
		System.out.println(ss);
		//To fetch the length of the list
		
		System.out.println("Total available values in list" + ob1.size());
		
		//to fetch all the item available in the list
	
		Iterator itr = ob1.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		for(String value: ob1){
			System.out.println(value);
		}
		
	//	Iterable-> collection->list->arraylist(singly linked) /Linked list (doubly linked)

	}
	/**
	 * 1. Can contain duplicate elements
	 * 2. Maintains insertion order
	 * 3. Non-synchronized
	 * 4. Random access is allowed
	 * 5. Manipulation is slow because lot of shifting is required
	 * 6. Remove all wil remove when we have duplicate elements on both the list
	 */

}
