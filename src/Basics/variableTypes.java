package Basics;

public class variableTypes {

	int n = 2; //instance variable
	static int p = 200000; // static variable 
	
	public void bank(){
		int r = 10;//local variable
		int interest = (p*n*r)/100;
		System.out.println("Interest at bank is : " + interest);
		
	}
	
	public void icicibank(){
		int r = 12;
		
		int interest = (p*n*r)/100;
		System.out.println("Interest at icicibank is : " + interest);
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variableTypes ob = new variableTypes();
		ob.bank();
		ob.icicibank();
		
		System.out.println("Value for instance variable is : " + ob.n);
		//System.out.println("Value for local variable is : " + r); //we get compilation error for local variable.
		//since the access level is limited only on the corresponding method
		System.out.println("Value for static variable is : " + p);
		
	}

	
}
