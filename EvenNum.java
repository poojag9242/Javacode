package javapractice;

public class EvenNum {

	public static void main(String[] args) {
		//while loop
		int i=1;
		while (i<=50) {
			if(i%2==0) {    
				System.out.print(i+ " ");
			}
			i++;
			}
		System.out.println();
		//for loop
		
		for(int n=50 ;n>=1;n--) {
			if(n%2==0) {
			System.out.print(n+ " " );
		                }
                      }
		System.out.println();
		//do while loop
		
		int j=1;
		do {
			if(j%2==0) {    
				System.out.print(j+ " ");
			}
			j++;
			}while (j<=50);
		
		
}
}
