package javapractice;

public class ProgRev {

		
		public static void main(String[] args) {
			
			int num=1234;
			
			int rev=0,rem;
			
		
			while(num>0) {        
			 rem=num%10;         // 1234%10= 4      123%10=3     12%10=2      1%10=1
			 rev =(rev*10)+rem; // 0+4=4        4*10+3=43    43*10+2=432  432*10+1=4321
			 num=num/10;  // 1234/10=123       123/10=12      12/10=1      1/10=0
		}
			
			System.out.print(rev);
					
		}
	}


