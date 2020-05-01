package Java0808;

import javax.swing.JOptionPane;

public class GetUserInput {
	
	public void access(){
		String FName = JOptionPane.showInputDialog("Enter value of A ");
		
		String LName = "Krishnan";
		
		String FullName = FName + LName;
		System.out.println("FullName of the student is " + FullName);
	}
	
	public static void main(String[] args) {
		GetUserInput ob = new GetUserInput();
		ob.access();
	}

}
