package Basics04072018;

public class DynamicArray {
	
	public void access(){
		//syntax ==> <datatype>[] <arrayname> = { , , , , };
		
		String[] color = {"Orange" , "Yellow", "Blue", "Purple", "Violet", "Pink", "Red"};
		
		int size = color.length;
		System.out.println("Total colors available : " + size);
		int i = 0;
		
		while(i<size){
			System.out.println("Available colors are at position " + i + "==>" + color[i]);
			i++;
		}
	}
	
	public static void main(String[] args) {
		DynamicArray ob = new DynamicArray();
		ob.access();
	}
}
