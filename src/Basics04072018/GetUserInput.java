package Basics04072018;

import javax.swing.JOptionPane;

public class GetUserInput {
	
	//Retrieving input during run time using Joptionpane class
	
	public void access(){
		String Lname = JOptionPane.showInputDialog("Enter the Last name :");
		System.out.println("Last name is : " + Lname);
		String Fname = "Anitha";
		String FullName = Fname+Lname;
		
		System.out.println("FullName of the candidate is : " + FullName);
	}
	
	public static void main(String[] args) {
		GetUserInput ob = new GetUserInput();
		ob.access();
	}

}
