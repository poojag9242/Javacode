package javapractice;

public class ProgSwap_3 {

	public static void main(String[] args) {

           //swap using 3rd var
		
		int a=10;
		int b=20;
		int temp;
		System.out.println("befor swapping "+ a +" "+b);
		
		temp=a;
		a=b;
	    b=temp;
	    System.out.println("after swapping "+ a +" "+b);
	    
	    
	    //using operator
	    a =a+b; //10+20=30   a=30
	    b=a-b; //30-20=10     b=10
	    a=a-b; //30-10=20     a=20
	    System.out.println("after swapping "+ a +" "+b);
	    
	    a =a*b;  //10*20=30
	    b=a/b;   //30/20=
	    a=a/b;
	    System.out.println("after swapping "+ a +" "+b);
	}

}
