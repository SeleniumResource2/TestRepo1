package Basics;

public class marksScored {
	
	public void marks(){
		int maths = 200;
		int science = 200;
		int English = 150;
		System.out.println("Total subjects " + (maths + science + English));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Anonymous object is nothing but a namless object
		//new marksScored().marks();
		
		marksScored ob1 = new marksScored(), ob2 = new marksScored();
		
		ob1.marks(); ob2.marks();
	}

}
