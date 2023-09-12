package javapractice;

import java.util.Scanner;

public class ProgSort6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		 int size=sc.nextInt();
		 
		 int[] arr=new int[size];
		 
		 System.out.println("enter the values of array");
		 
		 for (int i=0;i<=size-1;i++) {
			 arr[i]= sc.nextInt();
		 }
		 
		 for (int i=0;i<=size-1;i++) {
			 for(int j=i+1;j<=size-1;j++) {
				 if(arr[i] > arr[j]) {
			
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
			 
		 }
		 for (int i=0;i<=size-1;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

}
