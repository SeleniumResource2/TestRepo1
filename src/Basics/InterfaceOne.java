package Basics;

public interface InterfaceOne { //public interface <interfacename>
	
	public void door();
	
	public void window();
	
	public void kitchen();
	
	public static void main(String[] args) {
		InterfaceOne ob = new Interfacedefenition();
		
		ob.door();
		ob.window();
		ob.kitchen();
		
		
		
	}
	

}
//100% abstract method
//interface extends interface 
//instance can be created for interface only when the same has been implemented by java class
//list(interface)===> implemented by [java class]Arraylist or LinkedList
