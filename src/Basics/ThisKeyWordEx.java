package Basics;

public class ThisKeyWordEx {

	int rollno;
	int TotalStudents;
	int EB;
	int TVcharges = 160;
		
	public ThisKeyWordEx(int rollno, int TotalStudents, int EB){ //local variable
		
		this.rollno = rollno;
		this.TotalStudents = TotalStudents;
		this.EB = 300; //100
		System.out.println(rollno + " " + TotalStudents);
	}
	
	void exp(){
		int totalexp = (EB+ TVcharges);
		System.out.println("Prev month exp " + totalexp );
	}
	
	void display(){ // instance variable 
		exp(); // in jvm same would be referred as this.exp();
		System.out.println(rollno + " " + TotalStudents);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyWordEx ob = new ThisKeyWordEx(10, 100, 300);
		ob.display();
	}

}
//EB bill/othercharges for everymonth
//expenses ==> includes eb bill as well
