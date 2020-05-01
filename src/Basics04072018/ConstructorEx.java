package Basics04072018;

import javax.swing.JOptionPane;

public class ConstructorEx {
	
	/*Constructor is the first call happens when instance is created
	 * public <classname>(){..}
	 * constructor should not have any return type
	 */
	
	public void concat(){
		String Lname = JOptionPane.showInputDialog("Enter the Last name :");
		System.out.println("Last name is : " + Lname);
		String Fname = "Anitha";
		String FullName = Fname+Lname;
		
		System.out.println("FullName of the candidate is : " + FullName);
	}
	
	public ConstructorEx(){//Default constructor
		System.out.println("Default constructor is initiated first...");
	}
	
	public ConstructorEx(String course){//constructor overloading or Argument constructor
		System.out.println("Course opted is : " + course);
	}
	
	public static void main(String[] args) {
		System.out.println("Argument constructor invoked first");
		ConstructorEx ob = new ConstructorEx("Hadoop");
		ob.concat();
		System.out.println("===================================");
		System.out.println("Default constructor invoked first");
		ConstructorEx ob1 = new ConstructorEx();
		ob1.concat();
	}

}


