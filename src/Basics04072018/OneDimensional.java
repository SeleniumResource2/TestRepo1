package Basics04072018;

public class OneDimensional {
	
	/*Array: When we have similar group of elements then we go for Array
	 * eg: chair, table, cot, shelf
	 * Array stores the value by position(index).
	 * Index always starts from zero
	 * 	 Syntax: <datatype>[] <arrayname> = new <DataType>[Size of the element]
	 *  
	 */
	
	//Array declaration
	String[] color = new String[5];

	public void display(){
	//Array initialization
	color[0] = "Blue";
	color[1] = "Brown";
	color[2] = "White";
	color[3] = "Green";
	color[4] = "Yellow";
	
	//To fetch array value at specific position
	
	System.out.println("Color at position three : " + color[3]);
	
	//To fetch all values
	
	//size of the array
	int size = color.length;
	System.out.println("Total color are : " + size);
	
	for(int i = 0; i<size; i++){
		System.out.println("Available colors are : " + color[i]);
	}
	
	}
	
	public static void main(String[] args) {
		OneDimensional ob = new OneDimensional();
		ob.display();
	}
}
