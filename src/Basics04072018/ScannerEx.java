package Basics04072018;

import java.util.Scanner;

public class ScannerEx {
	
	//Retrieving the user input in console window can be done using Scanner class
	
	public void access(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name of the candidate : ");
		String Name = scan.next();
		
		System.out.println("Enter the Age : ");
		int Age = scan.nextInt();
		
		System.out.println("Enter the salary retrieval : ");
		double salary = scan.nextDouble();
		
		System.out.println("Enter the Gender : ");
		String Gender = scan.next();
		
		System.out.println("Does the candidate is handicapped :");
		boolean handicapped = scan.nextBoolean();
		
		System.out.println("Name of the candidate : " + Name  
				+ "\n" + "Age : " + Age
				+ "\n" + "Salary : " + salary
				+ "\n" + "Gender : " + Gender
				+ "\n" + "Physically Handicapped :" + handicapped);		
	}
	
	public static void main(String[] args) {
		ScannerEx ob = new ScannerEx();
		ob.access();
	}

}
