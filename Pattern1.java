package javapractice;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("for loop");
		//for loop
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=5-i) {
				System.out.print(" ");
			}
			else {
				
			System.out.print("*");
			}
			}
			System.out.println(" ");
		}
		
		System.out.println("while loop");
		
		//while loop
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
					if(j<=5-i) {
					System.out.print(" ");
				}
				else {
					
				System.out.print("*");
				}
              j++;
			}
              System.out.println(" ");
	            i++;
		}
			
			
		
	
System.out.println("do while loop");
		
		// dowhile loop
    int n=1;
          do {
        	  int j=1;
        	  do {
        	  
        	  if(j<=5-n) {
					System.out.print(" ");
				}
				else {
					
				System.out.print("*");
				}
        	  j++;
           		  
          }  while(j<=5) ;
        	  n++;
  			System.out.println(" ");
        	  
	  
          }while(n<=5);
	
	
	}	
	


	}


