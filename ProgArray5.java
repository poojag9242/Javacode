package javapractice;

import java.util.Scanner;

public class ProgArray5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		 int size=sc.nextInt();
		 int[] arr=new int[size];
		 System.out.println("enter the values of array");
		 for (int i=0;i<=size-1;i++) {
			 arr[i]= sc.nextInt();
		 }
		 int sum=0;
		 for(int i=0;i<=size-1;i++) {
			 sum=sum+arr[i];
		 }
		 System.out.println(sum);

	}

}
