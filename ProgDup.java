package javapractice;

import java.util.Scanner;

public class ProgDup {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			System.out.println("enter the string");
			String str=sc.nextLine();
			char ch[]=str.toCharArray();
			int n=ch.length;
			for (int i=0 ; i<n ;i++) {
				int count=1;
				for(int j=i+1 ; j<n ;j++) {
					if(ch[i]!= ' ' && ch[i]==ch[j]) {
						count++;
						
					}
				}
				if(count>1) {
					System.out.println(ch[i]+ " =" + count);
				}
			}
	}
	}
