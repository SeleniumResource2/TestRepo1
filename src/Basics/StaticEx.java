package Basics;

public class StaticEx {
	
	//Static key word can be used for variable and method
	//static or class variable
	//Static block static{}
	

	//This is utilized for using the memory efficiently
	
	int roll_no;
	String name;
	static String academy = "Hope_Tutors";
	
	static{
		academy = "XSFSDFDHDFHG"; 
		System.out.println(academy + "For evaluation of static block");
		
		// can change static variable
		//You cannot call any non-static instance in static block
	}
	
	StaticEx(int r, String n){
		roll_no = r;
		name = n;
		System.out.println();
	}
	
	void display(){
		System.out.println( "Roll no is " + roll_no + " for Student " + name + " in academy " + academy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		academy = "SRM";
		
		StaticEx ob = new StaticEx(1123, "Krish");
		ob.display();
		StaticEx ob1 = new StaticEx(1124, "Ganesh");
		ob1.display();
		

	}

}
