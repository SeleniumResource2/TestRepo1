package Basics;

public class CapOperator {


	double pi = 3.14;
	double r = 4;
	public void square(){
		r = Math.pow(r, 2);
		double radius = pi * r;
		System.out.println("Radius for square is " + radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CapOperator().square();
	}

}
