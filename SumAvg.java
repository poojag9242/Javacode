package javapractice;

import java.util.Scanner;

public class SumAvg {

		public static void main(String[] args) {
			int esum=0;
			int eavg=0;
			int ecount=0;
			int osum=0;
			int oavg=0;
			int ocount=0;
			Scanner sc =new Scanner (System.in);
			System.out.println("enter the size of array");
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			System.out.println("enter the values of array");

			
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
				}
			
			for(int i=0;i<size;i++) {
				if(arr[i]%2==0) {
					ecount++;
					esum=esum+arr[i];
					eavg=esum/ecount;
					
					}
				else {
					ocount++;
					osum=osum+arr[i];
					oavg=osum/ocount;
					
					
				}
				}
			System.out.println("sum of even numbers " +esum);
			System.out.println("average of even numbers " +eavg);
			System.out.println("sum of odd numbers " +osum);
			System.out.println("average of odd numbers " +oavg);
			

		}

	}



