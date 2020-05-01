package Basics04072018;

public class TwoDimensionalArray {
	
	public void access(){
		 String[][] color = new String[2][3]; //declaration of two dimensional array
		 
		 //initialization of values for array -> color
		 color[0][0] = "Orange";
		 color[0][1] = "Blue";
		 //color[0][2] = "Green";
		 color[1][0] = "Purple";
		 color[1][1] = "Yellow";
		 color[1][2] = "Violet";
		 
		 //To print the specific position value
		 System.out.println("Value at specific position " + color[1][0]);//Purple
		 
		 //To print all the value
		 
			 for(int i =0; i<2; i++){//This loop is for row
				 for(int j=0; j<3; j++){//This loop is for column
					 System.out.println("Available colors are : " + i + " " + j + "==>" + color[i][j]);
					 
				 }
			 }
		 
	}
	
	public static void main(String[] args) {
		TwoDimensionalArray ob = new TwoDimensionalArray();
		ob.access();
	}

}
