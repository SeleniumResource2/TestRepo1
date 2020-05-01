package Basics;

public class methodWithReturn {
	
	public void subjects(){ //Method without return
		int Maths = 200;
		int Science = 180;
		int English = 150;
		
		System.out.println("Total score : " + (Maths+Science+English));
		
	}
	
	public int Average(){//Method with return
		
		int total_score = 480;
		int average = total_score/3;
		System.out.println("Average is " + average);
		return average; 
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodWithReturn ob = new methodWithReturn();
		ob.subjects();
		System.out.println("Providing print statment for return type of method "+ ob.Average());
	}

}
