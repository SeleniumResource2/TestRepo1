package Basics;

import javax.swing.JOptionPane;

public class Sub_ClassForSuperKey extends SuperKeyWordEx{
	
	String captcha;
	
	public void RevisedDepartment(){
		int RevisedDepart = 30;
		int TotalDepart = RevisedDepart + super.Department;
		
		System.out.println(TotalDepart + " Are current department in " + super.college);
		
		
	}
	
	public void display(){
		System.out.println("===========Accessing method of parent class===========");
		super.course();
	}
	
	public Sub_ClassForSuperKey(){
		super();
		System.out.println("Constructor of the sub class is invoked");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_ClassForSuperKey ob = new Sub_ClassForSuperKey();
		ob.RevisedDepartment();
		ob.display();
	}

}
