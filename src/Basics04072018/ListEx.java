package Basics04072018;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	
	public void access(){
		
		//Declaration of list
		/*All primitive data type became class [int, short, byte, long, float, double, boolean, char all these became class
		 * and further in collections we refer them as Wrapper class. Wrapper class gets induced in angular braces called generics
		 * Integer, Double, Boolean, Character
		 */
		
		List<Integer> obj = new ArrayList<Integer>();
		//Add records or insert values
		
		obj.add(100);
		obj.add(300);
		obj.add(100);
		obj.add(400);
		obj.add(50);
		
		obj.add(1, 111); //Insertion on index
		obj.remove(4); //removing a record
		
/*	On using generics and wrapper class we can restrict the type of data that we insert	
 * obj.add("Name");
		obj.add(41.4f);
		obj.add(true);*/
		
		//To fetch the value based on index
		System.out.println(obj.get(3));
		
		//Fetch all values - by using enhanced for loop
		System.out.println("============After using Wrapper class and generics===========");
		for(int a : obj){
			System.out.println(a);
		}
		
		
	}
	
	public static void main(String[] args) {
		ListEx ob = new ListEx();
		ob.access();
	}

	
}


/*	Disadvantage: Arrays have fixed size [100] => [50]
		int[] No = new int[10];
size of element is 100 but used value is 5
No[0] = 10;
No[1] = 20;
No[2] = 30;
-
-*/