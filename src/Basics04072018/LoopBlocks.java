package Basics04072018;

public class LoopBlocks {
	
	public void forLoop(){
		System.out.println("=============For Loop==========");
		for(int i = 10; i<15; i++){
			System.out.println("Value of i is : " + i);
		}
	}
	
	public void WhileDo(){
		int i = 11;
		while(i<5){
			System.out.println("Value of i in whiledo loop : " + i);
			i++;
		}
	}
	
	public void DoWhile(){
		int i=11;
		do{
			System.out.println("Value of i in DoWhile Loop is : " + i);
			i++;
		}while(i<10);
	}
	
	public static void main(String[] args) {
		LoopBlocks ob = new LoopBlocks();
		ob.forLoop();
		ob.WhileDo();
		ob.DoWhile();
	}
	
}
