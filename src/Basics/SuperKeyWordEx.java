package Basics;

public class SuperKeyWordEx {
	
	static int Department = 20;
	
	String college = "SRM";
	
	
	public void course(){
		
		System.out.println(Department + " Department in " + college);
		System.out.println("====================================");
		
		String cou1 = "Industrial Electronics";
		String cou2 = "Physics";
		String cou3 = "Industrial Chemistry";
		
		System.out.println("Total course are  :" + "\n" + cou1 + "\n" + cou2  +"\n" +  cou3 );
		
		System.out.println("====================================");
		
	}
	
	public SuperKeyWordEx(){
		super();
		System.out.println("**************************************");
		System.out.println(" Constructor of the parent class ");
		System.out.println("**************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyWordEx ob = new SuperKeyWordEx();
		ob.course();

	}

}
