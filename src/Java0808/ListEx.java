package Java0808;

import java.util.Iterator;
import java.util.Vector;

public class ListEx {

	public void access() {

		// declaration
		Vector ob = new Vector();

		ob.add(123);
		ob.add(23);
		ob.add(32);
		ob.add(123);
		ob.add(111);
		ob.add("Sarika");
		ob.add(12.45);

		Iterator itr = ob.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		ListEx ob = new ListEx();
		ob.access();
	}
}

/*
 * for(int i =0; i<10; i++){ //For loop requires initialization, condition and
 * increment/decrement }
 * 
 * //Enhanced for loop for(int a: ob){
 * 
 * }
 */