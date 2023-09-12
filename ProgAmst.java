package javapractice;

public class ProgAmst {
	
		public static void main(String[] args) {
			//amstrong num  153=1^3+5^3+3^3=1+125+27=153
			
			int num=153;
			double ams=0;
			int count=0;
			
			int n=num;
			
			while(num>0) {
				num=num%10;
				count++;
			}
			num=n;
			while(num>0) {
				int rem=num%10;
				 ams=ams+Math.pow(rem,count);
				 num=num/10;
			}
			if(n==ams) {
				System.out.println(n + " is a amstrong number");
				} 
			else {
				System.out.println(n + " is not a amstrong number");
			}

		}

	}



