package Basics04072018;

public class VariableTypesEx {
	
	static int basic = 20000; //static or class variable
	int conveyance = 500; //instance or global variable
	
	public void FebSalary(){//non-static method
		int Bonus = 1000; //local variable
		int totalPay = basic + conveyance + Bonus;
		System.out.println("Total pay out on February salary : " + totalPay);
	}
	
	public void MarchSalary(){//non-static method
		int Bonus = 2000;
		int totalPay = basic + conveyance + Bonus;
		System.out.println("Total pay out on March salary : " + totalPay);
	}
	
	public static void incentive(){//static method
		//we cannot access instance variable (non-static) inside the static method
		int NoOfDays = 4;
		int incentive = 1000;
		int total_incentive = NoOfDays+incentive+basic;
		System.out.println("total incentive acquired for year 2018 is : " + total_incentive);
	}
	
	public static void main(String[] args) {
		VariableTypesEx ob1 = new VariableTypesEx();
		ob1.FebSalary();
		ob1.MarchSalary();//non-static method requires a reference when called inside the static main method
		System.out.println("Accessing static variable - basic : " + basic);
		System.out.println("Accessing instance variable - coveyance with reference: " + ob1.conveyance);
		incentive(); //static method called inside the static main method does not require a reference
	}
	

}
