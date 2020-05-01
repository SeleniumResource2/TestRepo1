package Basics;

public class methodWithArgument {

	public void marks(){//Method without argument
		int sem1 = 75;
		int sem2 = 60;
		int sem3 = 80;
		System.out.println("Average score on three semesters :" + (sem1+sem2+sem3)/3);
	}
	
	
	public void students(int rollno, String name){ //method with argument
		System.out.println(rollno + " " + name);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodWithArgument ob = new methodWithArgument();
		ob.marks();
		ob.students(111, "Krish");
		ob.students(222, "Mohan");
		ob.students(333, "Shakthi");
		
		methodWithArgument ob1 = new methodWithArgument();
		ob1.marks();
		ob1.students(121, "Satish");
	}

}

/**ways to initialize object:

By reference variable
By method
By constructor*/