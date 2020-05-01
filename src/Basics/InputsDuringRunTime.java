package Basics;

import javax.swing.JOptionPane;

public class InputsDuringRunTime {

	public String input;
	
	public void display(){
		input = JOptionPane.showInputDialog("Provide the name ");
		String name = input;
		System.out.println("Input arrivered is : " + name);
				
	}
	
	public static void main(String[] args) {
		new InputsDuringRunTime().display();
	}

}
