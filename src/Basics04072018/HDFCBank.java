package Basics04072018;

public class HDFCBank extends BankInterest{ //SubClass
	
	public void Interset(int p, int n){
		int r = 12;
		int IntCal = (p*n*r)/100;
		System.out.println("HDFC ==> Interest evaluated is: " + IntCal);
	}

}
