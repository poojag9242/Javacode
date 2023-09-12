package javapractice;

public class ProgFibnocaiii {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8.....                //a+b=sum
		int a=0;                            //0+1=1  1+1=2 
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int sum=0;
		
		for(int i=1;i<=20;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
			
		}

	}

}
