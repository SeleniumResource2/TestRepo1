package Java0808;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	
	public static void main(String[] args) {
		
	
	Map<Integer, color> master = new HashMap<Integer, color>();
	
	//adding records for color
	color c1 = new color("Blue" , 11);
	color c2 = new color("Orange" , 12);
	color c3 = new color("Yellow" , 8);
	color c4 = new color("Green" , 21);
	
	master.put(1111, c1);
	master.put(1112, c2);
	master.put(1113, c3);
	master.put(1114, c4);
	
	for(Map.Entry<Integer, color> k: master.entrySet()){
		
		int key = k.getKey();
		color cc = k.getValue();
		System.out.println(k.getKey() + "======" + cc.color + " corresponding code " + cc.code);
	}
	}
}


