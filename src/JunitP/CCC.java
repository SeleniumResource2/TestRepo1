package JunitP;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AAA.class, BBB.class})
public class CCC {
	

	@BeforeClass
	public static void startServer(){
		System.out.println("Initiate server");
	}
	
	@AfterClass
	public static void tearDownServer(){
		System.out.println("Server shut down");
	}

}
