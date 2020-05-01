package Java0808;

public class MethodWithReturn {
	
	//presence of void ==> No Return
	//absence of void ==> return should be there
	
	public void addition(){//Method without return
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println("Value of addition " + c);
		
	}
	
	public int subtraction(){//Method with return
		//Return type should be same as method type
		
		int a = 300, b = 100, c;
		c = a-b;
		
		return c;
		
	}
	
	public static void main(String[] args) {
		MethodWithReturn ob = new MethodWithReturn();
		ob.addition();
		System.out.println("Value of subtraction is : " + ob.subtraction());
	}

}
