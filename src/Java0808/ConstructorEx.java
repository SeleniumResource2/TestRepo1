package Java0808;

public class ConstructorEx {
	int a, b;
	
	public static void main(String[] args) {
		ConstructorEx ob = new ConstructorEx();
		ob.addition();
		
		ConstructorEx ob1 = new ConstructorEx(204, 130);
		ob1.subtraction();
		ob1.addition();
		
		
		ConstructorEx ob11 = new ConstructorEx(1204, 1130);
		ob11.addition();
		ob11.subtraction();
		}
	
	//Constructor ==> public <classname>(){ ...}
	//Should not have any return type
	//constructor would be the first call
	public ConstructorEx(){
		System.out.println("This is a default constructor");
	}
	
	public ConstructorEx(int aa, int bb){//parameterized or argument constructor
		a=aa;
		b=bb;
	}
	
	public void addition(){//user defined method

		int c = a+b;
		System.out.println("Value of addition " + c);
		
	}
	
	public void subtraction(){//user defined method
		int c = a-b;
		System.out.println("Value of subtraction is " + c);
	}
	
	

}
