package Basics;

public class learning {

	int fee;
	String course;
	
	
	public void intialize(int f, String course1){ //local variable
		fee = f;
		course = course1;
	}
	
	
	public void display(){
		System.out.println("For course that has been opted : " + course);
		System.out.println("Initial fees : " + fee);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learning ob = new learning();
		ob.intialize(2000, "SAS");
		ob.display();
		

	}

}
