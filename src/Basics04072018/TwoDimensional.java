package Basics04072018;

public class TwoDimensional {
	
	//Array declaration for two dimensional
	//<DataType>[][] <ArrayName> = new <DataType>[Size of element][size of element]
	
	public void access(){
		String[][] browser = new String[2][3];
		
		//initialization
		
		browser[0][0] = "Chrome";
		browser[0][1]= "Safari";
		browser[0][2] = "Firefox";
		browser[1][0] = "InternetExplorer";
		browser[1][1] = "MicrosoftEdge";
		browser[1][2] = "UC Browser";
		
		//To fetch value at specific position
		System.out.println("Value at specific index : " + browser[1][1]);
		
		//To fetch all values
		
		for(int row =0; row<2; row++){ // row 
			for(int col=0; col<3; col++){ //column 
				System.out.println("Available values are : " + browser[row][col]);
			}
		}
	}

	public static void main(String[] args) {
		TwoDimensional ob = new TwoDimensional();
		ob.access();
	}
}
