package javapractice;



public class ProgLast4 {
	
	
	 public  int last(int num) {
		  int rem=num%10;
		  return rem;
		 }
		 

	public static void main(String[] args) {
		
		 ProgLast4 p =new ProgLast4();
		 int res=p.last(1234);
		 System.out.println(res);
		
		 
		
	  

	}

}
