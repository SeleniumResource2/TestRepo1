package Basics;

import java.util.Scanner;

public class ScannerEx {
	
	public void display(){
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the name : ");
		
		String name = scan.next();
		
		System.out.println( "Name provided " + name);
		
		System.out.println("Enter the age ");
		
		int age = scan.nextInt();
		
		System.out.println(" Percentage of vote scored ");
		
		double vote = scan.nextDouble();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ScannerEx().display();
	}

}
