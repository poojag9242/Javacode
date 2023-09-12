package javapractice;

import java.util.Scanner;

public class ProgLargerNum1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a");
		System.out.println("enter the value of b");
		System.out.println("enter the value of c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a +"is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b +"is largest");
		}
		else{
			System.out.println(c +"is largest");
		}
	 int res=(a>b?a:b);
	 System.out.println(res);
	 
	 int res1=((a>b && a>c)? a : (b>a && b>c) ? b:c);
	 System.out.println(res1);
		 
	 }

}
