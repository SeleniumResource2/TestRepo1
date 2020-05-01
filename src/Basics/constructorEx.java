package Basics;

public class constructorEx {
	
	int door_no;
	double percentage;
	
	/*public void add(int d , double p){
		door_no = d;
		percentage = p;
		System.out.println("Door no is : " + d);
		System.out.println("Percentage is : " + p);
	}*/
	
	void display(){
		
		System.out.println("Door no is : " + door_no);
		System.out.println("Percentage is : " + percentage);
		
	}
	public constructorEx(int dd, double pp){
		door_no = dd;
		percentage = pp;
		System.out.println("Calling default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructorEx ob = new constructorEx();
		constructorEx ob = new constructorEx(2000, 38.23);
		ob.display();
		//ob.add(200, 34.2);
		
	}

}


/**Constructor is also a block of method
 * constructor name should be same as class name
 * constructor should not have any return
 * Two types of constructor: Default constructor / Parmeterized constructor
 * 
 */