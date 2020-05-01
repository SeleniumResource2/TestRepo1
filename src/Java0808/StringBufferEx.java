package Java0808;

public class StringBufferEx {
	
	public static void main(String[] args) {
		//StringBuffer and StringBuilder class are mutable. Hence re-initialization is not required
		StringBuilder fname = new StringBuilder("Harish");
		
		String lname = "Kannan";
		fname.append(lname);
		System.out.println(fname);
		
		StringBuffer fname1 = new StringBuffer("Sakshi");
		
		String lname1 = "Krishna";
		fname1.append(lname1);
		System.out.println(fname1);
		
		fname1.reverse();//String reversal
		System.out.println(fname1);
		
	}

}
