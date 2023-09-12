package javapractice;

public class ProgPattern_2 {

	public static void main(String[] args) {
		System.out.println("for loop");
		//for loop
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			} 
			System.out.println(" ");
		}
		
		System.out.println("while loop");
		
		//while loop
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
				} 
			i++;
			System.out.println(" ");
			
		}
	
System.out.println("do while loop");
		
		// dowhile loop
    int n=1;
          do {
        	  int j=1;
        	  do {
        		  System.out.print("*");
  				j++;
  				} while(j<=n) ;
        	  n++;
  			System.out.println(" ");
        	  
	  
          }while(n<=5);
	
	
	}	
	}


