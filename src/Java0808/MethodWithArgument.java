package Java0808;

public class MethodWithArgument {
	
	public void addition(){//Method without argument
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println("Value of addition " + c);
		
	}
	
	public void Subtraction(int a, int b){//Method with argument
		int c = a-b;
		System.out.println("Subtraction result is : " + c);
	}
	
	public static void main(String[] args) {
		MethodWithArgument ob = new MethodWithArgument();
		ob.addition();
		ob.Subtraction(445, 100);
	}

}
