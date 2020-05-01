package Java0808;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	
	/*
	 * Map contains both key and corresponding value pair. Each key and value pair is referred as entry
	 * Map contains only unique values
	 * Two Interface: 1. Map--->HashMap and LinkedHashMap 2. SortedMap--->TreeMap
	 */
public static void main(String[] args) {
	
//map declaration
	Map<Integer, String> mm = new HashMap<Integer, String>();
	
	//adding records
	
	mm.put(1011, "Radhika");
	mm.put(1012, "Krishna");
	mm.put(1013, "Anitha");
	mm.put(1014, "Sebastin");
	
/*	for(Map.Entry m: mm.entrySet()){
		System.out.println(m.getKey() + "===>" + m.getValue());
	}*/
	
	mm.remove(1013);
	Set set = mm.entrySet();
	
	Iterator itr = set.iterator();
	
	while(itr.hasNext()){
		Map.Entry entry = (Map.Entry) itr.next();
		
		System.out.println(entry.getKey() + "===//===>" + entry.getValue());
		
	}
	
}
}
