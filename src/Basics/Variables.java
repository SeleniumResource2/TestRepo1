package Basics;

public class Variables {
	
	public static void main(String[] args) {
		final int fee = 30000;
		char gender = 'F';
		String name = "Seetha";
		double percentage = 75.50;
		System.out.println("Software course taken by " + name );
		System.out.println("Payment done for software course " + fee + "\n" + "Offer prescribed for gender " + gender );
		System.out.println("Percentage score on evaluation is : "+ percentage );
		
		//fee = 40000;//compilation error becoz modifer of fee is final
		name = "Kirthiga"; // we can reinitialize any number of time for the variable which is not declared as final
		System.out.println("Software course taken by " + name );
		
	}

}
