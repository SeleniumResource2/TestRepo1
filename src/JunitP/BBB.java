package JunitP;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BBB {
	
	
	
	@Test
	public void subjects(){ //Method without return
		int Maths = 200;
		int Science = 180;
		int English = 150;
		
		System.out.println("Total score : " + (Maths+Science+English));
		
	}
	
	@Test
	public void Average(){//Method with return
		
		int total_score = 480;
		int average = total_score/3;
		System.out.println("Average is " + average);
		
		
	}
	

}
