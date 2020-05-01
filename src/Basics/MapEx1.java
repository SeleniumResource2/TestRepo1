package Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap hm = new HashMap();
		TreeMap hm = new TreeMap();
		hm.put("Kevin" , "13");
		hm.put("Anitha", "18");
		hm.put("Jenifer", "24");
		System.out.println(hm.containsKey("sdfsdf"));
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey() + " : " + me.getValue());
			
		}
	}

}
/**
 * entrySet-> Map interface declares this method-> returns the set that contains map entry
 * Map.Entry==> Considered as each object (key, value)
 */
