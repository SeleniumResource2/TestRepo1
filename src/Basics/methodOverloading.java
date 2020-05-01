package Basics;

public class methodOverloading {
	
	//Method overloading is nothing but, having same method name but with different arguments
	
	public void employee(int rollno){
		System.out.println("Roll no is : " + rollno);
		
	}
	
	public void employee(int rollno, String Name){
		
		System.out.println("Emp Name " + Name + "for roll no : " + rollno);
		
	}
	
	public void employee(String address){
		
		System.out.println("Address details for roll no for 11021 " + address);
		
	}
	
	public void employee(String promotion, String name, int rollno){
		System.out.println("Promtion attained is " + promotion + "for" + name + "and his roll no is " + + rollno );
	}
	
	public void employee(String level, int rollno, Double percentagescore){
		
		System.out.println("Level or current designation is " + level + " And percentage scored is " + percentagescore);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloading ob = new methodOverloading();
		
		ob.employee(11021);
		ob.employee(" North west Street, T-Nagar");
		ob.employee("Manager", 11021, 87.5);
		
		

	}

}
