package Basics;

public class Interfacedefenition implements InterfaceOne, InterfaceTwo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacedefenition ob = new Interfacedefenition();
		ob.door();
	}
	@Override
	public void door() {
		// TODO Auto-generated method stub
		
		System.out.println("Door is made of teak wood");
		
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		System.out.println("Window is of size 20*26");
	}

	@Override
	public void kitchen() {
		// TODO Auto-generated method stub
		System.out.println("Kitchen has all sort of facilities");
	}

	@Override
	public void Shelf() {
		// TODO Auto-generated method stub
		System.out.println("Shelf is not very spacious");
	}

	@Override
	public void wardrobe() {
		// TODO Auto-generated method stub
		
		System.out.println("Wardrobe is not provided");
		
	}

	@Override
	public void flooring() {
		// TODO Auto-generated method stub
	System.out.println("Flooring is with Marbles");	
	}
	
	
	

}
