package Basics;

public class operatorEx {
	
	int a = 300;
	int b = 400;
	int c = 600;
	int d = 300;
	
	public void arithmetic(){
		
		System.out.println("Value of addition is :" + (a+b));
		System.out.println("Value of subtraction is :" + (c-a));
		System.out.println("Value of multiplication is :" + (a*b));
		System.out.println("Value of division is :" + (b/a));
		System.out.println("Value of modulous is :" + (c%a));
		}
	
	public void relatoinal(){ //output will be either true or false
		System.out.println("A is greater : " + (a>b));
		// <, >=, <=, ==, !=
		System.out.println("A is not equal to b : " + (a!=d)); //false
	}
	
	public void logical(){ //&&, || 
		
		System.out.println( (b>a) && (c>a)); //true : true => true
		System.out.println((b>a) && (a>c)); //true: false ==> false
		
		System.out.println( (b>a) || (c>a)); //true : true => true
		System.out.println((b>a) || (a>c)); //true : false => true
		
		System.out.println( "Not equal to operator :" + ((b>a) != (c>a))); //true != true
	}

	public void assignment(){
		a = a+4;
		System.out.println("Revised value of a is : " + a);
		a = a+4;
		System.out.println("Revised value of a is : " + a);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operatorEx ob = new operatorEx();
		ob.arithmetic();
		ob.relatoinal();
		ob.logical();
		ob.assignment();
	}

}
