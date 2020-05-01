package Basics04072018;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		int p = 200000, n = 2;
		BankInterest BI = new BankInterest(); //Creating object for specific class will fetch over the corresponding method in that class
		BI.Interset(p, n); //Rate of interest is 10
		
		ICICIBank IC = new ICICIBank();
		IC.Interset(p, n);//Rate of interest is 11
		
		HDFCBank HD = new HDFCBank();
		HD.Interset(p, n);//Rate of interest is 12
		
		//object name AB is created for AxisBank-class and By using the object name AB, trying to access the method in the class AxisBank 
				
		AxisBank AB = new AxisBank();
		AB.Interset(p, n);//Rate of interest is 13
		
		System.out.println("Concept of overriding happens now");
		System.out.println("=================================");
		
		//After inheriting Bank Interset to sub-class[HDFCBank, ICICIBank, AxisBank]
		
		//object name bank is created for BankInterest-class and By using the object name Bank, trying to access the method in the class ICICIBank
		BankInterest bank = new ICICIBank();
		bank.Interset(p, n); 
		
		//BankInterest is being the parent class and ICICIBank is sub-class
		//Trying to access the Sub class method, by the object created for parent-class
		//Concept of overriding is possible only when we use inheritance and same method is both available in both parent class and sub class		
	}

}
