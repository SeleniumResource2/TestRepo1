package Java0808;

public class VariableTypesEx {
	
	static int basic = 5000;//Static variable
	int conveyance = 500; //instance varaible
	
	public void FebSalary(){ //non-static method allows both static and non-static variable
		int bonus = 1000;//local variable
		
		int totalPayOut = basic+conveyance+bonus;
		
		System.out.println("Total pay out for the month " + totalPayOut);
	}
	
	public void MarSalary(){
		int bonus = 2000;
		int totalPayOut = basic+conveyance+bonus;
		
		System.out.println("Total pay out for the month " + totalPayOut);
	}
	
	public static void Details(){//Static method allows to use only static variable
		System.out.println("Pay out details with basic " + basic);
		//System.out.println(conveyance);
	}
	
	public static void main(String[] args) {
		VariableTypesEx ob = new VariableTypesEx();
		ob.FebSalary(); //non-static method is accesible inside static main method with reference
		ob.MarSalary();
		System.out.println("Static varaible : " + basic);
		System.out.println("Non-Static/Instance variable " + ob.conveyance);
		int bonus = 0;
		System.out.println("Local variable " + bonus);
	}

}
