package Java0808;

public class ConditionBlocks {
	
	int a =100; int b = 120; int c = 120;
	
	public void SwitchEx(String color){
		
		switch(color){
		case "blue":
			System.out.println("Represents color of ocean");
		break;
		case "Red":
			System.out.println("Represents one of the signal color on road");
		break;
		case "White":
			System.out.println("Represents peace");
		break;
		default:
			System.out.println("Try with other colors...");
		break;	
		}
	}
	
	public static void main(String[] args) {
		ConditionBlocks ob = new ConditionBlocks();
		ob.ifEx();
		ob.ifThenEx();
		ob.ifElseIf();
		ob.SwitchEx("White");
	}
	
	public void ifEx(){
		if(a>b){
			System.out.println("A is greater");
		}
	}
	
	public void ifThenEx(){
		if(a>b){
			System.out.println("A is greater");
		}else{
			System.out.println("B is greater");
		}
	}
	
	public void ifElseIf(){
		if(a>b){
			System.out.println("A is greater");
		}else if(b>c){
			System.out.println("B is greater");
		}else if(c>a){
			System.out.println("C is greater");
		}else{
			System.out.println("Try out with different set of data........");
		}
	}
	

}
