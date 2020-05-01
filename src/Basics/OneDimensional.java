package Basics;

public class OneDimensional {
	
	/**Syntax: 
	 * <Data Type>[] <ArrayName> = new <DataType>[Size of the element]
	 * Array will always start from zero
	 */
	
	String[] Students = new String[5];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Students = new String[5];
		
		Students[0] = "Kumar";
		Students[1] = "Satish";
		Students[2] = "Harish";
		Students[3] = "Aravind";
		
		System.out.println("Student name " +Students[5]);
		
	}

}
