package Java0808;

import java.util.Scanner;

public class ScannerEx {
	
	public void AverageScore(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter score of English :");
		
		int English = scan.nextInt();
		
		System.out.println("Enter score of Maths :");
		
		int Maths = scan.nextInt();
		
		System.out.println("Enter score of Physics :");
		
		int Physics = scan.nextInt();
		
		System.out.println("Enter score of Biology :");
		
		int Biology = scan.nextInt();
		
		System.out.println("Enter score of Chemistry :");
		
		int Chemistry = scan.nextInt();
		
		System.out.println("English Score :" + English);
		System.out.println("Maths Score :" + Maths);
		System.out.println("Physics Score :" + Physics);
		System.out.println("Biology Score :" + Biology);
		System.out.println("Chemistry Score :" + Chemistry);
		
		int Average = (English+Maths+Physics+Biology+Chemistry)/5;
		System.out.println("Average score :" + Average);
	}
	
	public static void main(String[] args) {
		ScannerEx ob = new ScannerEx();
		ob.AverageScore();
		
	}

}
