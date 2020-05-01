package Basics;

public class SRMCourse extends course{
	
public void coursedet(int No_of_student, String cou1){
		
		int discount = 6;
		int fee = 10000;
		
		if (No_of_student>5){
			int totfee = (fee*No_of_student)*discount/100;
			System.out.println("Total fee acquired for SRM " + totfee);
		}
		
		
	}


}
