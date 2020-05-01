package Basics;

public class labelledForLoop {
	
	public void sample(){
		FirstLoop: //label name
			for(int i =0; i<=3; i++){
				
				SecodLoop: //label name
					for(int j = 0; j<=3; j++){
						
						if(i==2 && j==2){
							continue;
							
						}
					System.out.println(i + " " + j);	
					}
			}
	}
	
	public static void main(String[] args) {
		labelledForLoop ob = new labelledForLoop();
		ob.sample();
	}

}
/*
i=0 j=0
i=0 j=1
i=0 j=2
i=0 j=3
i=1 j=0
i=1 j=1
i=1 j=2
i=1 j=3
i=2 j=0
i=2 j=1
i=2 j=2
*/
