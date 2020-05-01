package Basics;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) { //combination of key and value as a pair
		Map map = new HashMap(); //Map declaration
		//Adding records
		map.put("Girish" , "24");
		map.put("Anitha", "18");
		map.put("Jenifer", "13");
		
		//Printing records
		
		System.out.println("Map Elements");
		
		System.out.println(map);
		
		
	}

}
