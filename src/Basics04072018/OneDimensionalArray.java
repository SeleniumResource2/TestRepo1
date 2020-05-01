package Basics04072018;

public class OneDimensionalArray {
	
	/*Array is grouping similar type of elements
	 * Array index starts with zero. Means array stores the value position wise
	 * Syntax of array declaration : <Datatype>[] <arrayname> = new <Datatype>[Size of element]
	 */
	//Array declaration
	int[] EmployeeID = new int[6];
	//Array initialization
	public void access(){
	//Array initialization
	EmployeeID[0] = 111;
	EmployeeID[1] = 222;
	EmployeeID[2] = 333;
	EmployeeID[3] = 444;
	EmployeeID[4] = 555;
	EmployeeID[5] = 666;
	
/*	//System.out.println("Employee ID at position 6 ==>" + EmployeeID[6]);
	//Exception - "ArrayIndexOutofBoundsException" will be displayed when Printing the array value out of the declared position
	
	int size = EmployeeID.length;
	System.out.println("Total Available values are : " + size);
	
	
	int i = 0;
	//To print all the array values
	while(i<size){
		System.out.println("Employee ID displayed at position " + i + "==>" + EmployeeID[i]);
		i++;
	}*/
	
	//Enhanced for loop:
	
	for(int xx :EmployeeID){//Does not require any initialization, condition or increment
		System.out.println(xx);
	}
	}
	
	public static void main(String[] args) {
		OneDimensionalArray ob = new OneDimensionalArray();
		ob.access();
	}
}
