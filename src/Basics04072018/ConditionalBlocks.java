package Basics04072018;

public class ConditionalBlocks {
	
	int a = 200, b = 120, c = 340;
	
	public void ifEx(){
		System.out.println("=========IF statement=========");
		if(a>b){
			System.out.println("A is greater");
		}
	}
	
	public void ifThen(){
		System.out.println("=========IF THEN=========");
		if(a>c){
			System.out.println("A is greater");
		}else {
			System.out.println("C is greater");
		}
	}
	
	public void ifElseIf(){
		System.out.println("=========IF ELSE IF=========");
		if(b>a){
			System.out.println("B is greater");
		}else if(c>a){
			System.out.println("C is greater");
		}else if(a>b){
			System.out.println("A is greater");
		}else {
			System.out.println("Try out with other datas");
		}
		
	}
	
	public void switchCaseEx(String Place){
		System.out.println("=========SWITCH CASE=========");
		switch(Place){
		
		case "Salem":
			System.out.println("Famous for steel");
		break;
		
		case "Chennai":
			System.out.println("Marina Beach everlasting seashore");
		break;
		
		case "Mysore":
			System.out.println("Famous for silk sarees");
		break;
		
		case "Ooty":
			System.out.println("Tea Estate is more familiar");
		break;
		
		default:
			System.out.println("Try with some other places");
		}
	}
	
	public static void main(String[] args) {
		ConditionalBlocks ob = new ConditionalBlocks();
		ob.ifEx();
		ob.ifThen();
		ob.ifElseIf();
		ob.switchCaseEx("Chennai");
	}
}
