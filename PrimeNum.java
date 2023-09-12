package javapractice;

public class PrimeNum {
    
	public static void main(String[] args) {
		int i,j,count;
		for ( i=2 ;i<=50;i++) {
		        count=0;
			for( j=2 ;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
			      }
			}
		
		if(count==0 ) {
		System.out.print(i+ " ");
		}
		
		}
	}
}

