package Basics04072018;

public interface InterfaceEx {
	
	public void fuel();
	
	public void seat();
	
	public void Mileage();
		
	public static void main(String[] args) {
		InterfaceEx ob = new InterfaceExSub();
		ob.fuel();
		ob.seat();
		ob.Mileage();
	}

}
