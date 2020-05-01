package Basics04072018;

public class AxisBank extends BankInterest{ //SubClass
	public void Interset(int p, int n){
		int r = 13;
		int IntCal = (p*n*r)/100;
		System.out.println("AXIS ==> Interest evaluated is: " + IntCal);
	}
}
