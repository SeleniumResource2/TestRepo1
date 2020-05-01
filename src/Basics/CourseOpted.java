package Basics;

public class CourseOpted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		course ob = new course();
		ob.coursedet(10, "Selenium");
		
		SRMCourse ob1 = new SRMCourse();
		ob1.coursedet(10, "Selenium");
		
		AptechCourse ob2 = new AptechCourse();
		ob2.coursedet(10, "Selenium");
		
		course ob3 = new AptechCourse();
		ob3.coursedet(10, "Selenium");
		
	}

}
