package Java0808;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	
	public void access(){
		//Declaration of list interface with generics and wrapper class
		List<Integer> A = new ArrayList<Integer>();
		
		List<Integer> AA = new ArrayList<Integer>();
		
		A.add(23);
		A.add(33);
		A.add(44);
		A.add(55);
		A.add(23);
		A.add(66);
		//A.add(23.34);
		
		int count = A.size(); //Gives the size of array list
		
		for(int i =0; i<count; i++){
			System.out.println(A.get(i));
		}
		
		//enhanced for loop
		for(Integer x:A){
			System.out.println(x);
		}
		
		System.out.println(" New Array List=================>");
		AA.add(300);
		AA.add(400);
		AA.addAll(A);
		
		AA.add(2, 500);
		AA.remove(3);
		
		for(Integer XX:AA){
			System.out.println(XX);
		}
		
	}

	public static void main(String[] args) {
		ListEx1 ob = new ListEx1();
		ob.access();
	}
}
//LinkedList, Set