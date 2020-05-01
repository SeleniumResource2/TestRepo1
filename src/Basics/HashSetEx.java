package Basics;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx {
	
	public static void main(String[] args) {
		//List allows duplication
		//Set allows only unique elements
		//HashSetDeclaration==> HashSet<String>  <objectname> = new HashSet<>();
		//LinkedHashSet<String> <object name> = new LinkedHashSet<>();
		//TreeSet==> Contains unique elements , Accessing and retrieval is quite fast, Ascending order
		//TreeSetDeclaration> ==> TreeSet<String> <object name> = new TreeSet<>();
		//PriorityQueue<String> <objectname> = new PriorityQueue<String>();==> FirstInFirstout
		//<objectname>.element()==>retrieve heads value
		//<objectname>.queue()==>retrieve heads value
		//<objectname>.remove()==>removes head value
		//<objectname>.poll()==> removes head value
		//Deque==> element insertion and removal happens at both the ends
		//Deque<String> <objectname> = new 	deueue<String>();
		
		TreeSet<Student> tree = new TreeSet<>();
		Student s1 = new Student(284, "Sunil");
		Student s2 = new Student(360, "Suja");
		Student s3 = new Student(103, "Varsha");
		
		tree.add(s1);
		tree.add(s2);
		tree.add(s3);
		
		for(Student st:tree){
			System.out.println(st.id + " " + st.name + " ");
		
		}
	}

}
