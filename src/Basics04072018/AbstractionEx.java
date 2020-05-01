package Basics04072018;

public abstract class AbstractionEx {
	
	/*Abstraction is one of the oops concept.
	 * 
	 * Showing the functionality and hiding the implementation details
	 * 
	 */
	
	public void Furniture(){//Concrete method
		System.out.println("Furniture are made of steel");
	}
	
	public void Utensils(){//concrete method
		System.out.println("Mud pots are available for cooking");
	}
	
	public void Park(){//concrete method
		System.out.println("From childrens to elders can relax in VGP Park");
	}
	
	public abstract void Novels(); //Abstract method
	
	public abstract void Publishers(); //Abstract method
	
	public abstract void Temples();//Abstract method
	
	public static void main(String[] args) {
		AbstractionEx ob = new AbstractionExSub();//overriding concept
		ob.Furniture();
		ob.Utensils();
		ob.Park();
		ob.Publishers();
		ob.Novels();
		
	}

}
