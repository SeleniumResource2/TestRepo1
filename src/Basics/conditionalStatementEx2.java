
package Basics;



public class conditionalStatementEx2 {
	
	int a = 100;
	int b = 300;
	int c = 200;
	
	public void ifElse() throws InterruptedException{
		
		/*if(condition true){
		 * true block
		 * } else {
		 * false block
		 * }
		 * 
		 */
		
		if(a<b){
			
			System.out.println("A is not greater");	
			Thread.sleep(50000);
			System.out.println("A had the option to fetch the greater value");
		} else {
			System.out.println("A is greater");
		}
		
				
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		conditionalStatementEx2 ob = new conditionalStatementEx2();
		ob.ifElse();
	}

}
