package Basics04072018;

public class A {
	
	private void msg(){//Access Modifier - Private
		System.out.println("Access level for private method");
	}
	
	void DefaultMsg(){//Access Modifier - Default
		System.out.println("Access level for Default method");
	}
	
	protected void ProtectedMsg(){
		System.out.println("Access level for protected method");
	}
	
	public void PublicMsg(){
		System.out.println("Access level for public method");
	}
	
	public static void main(String[] args) {
		A ob = new A();
		ob.msg();
		ob.DefaultMsg();
		ob.ProtectedMsg();
		ob.PublicMsg();
	}

}
