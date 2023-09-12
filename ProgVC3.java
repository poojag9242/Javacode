package javapractice;

import java.util.Scanner;

public class ProgVC3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter the char");
		 char ch=sc.next().charAt(0);
		 
		 //method1
		 
		 if(ch=='a'||  ch=='e' ||ch=='i'||ch=='o'||ch=='u'
					||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			 System.out.println(ch +"char is vowel");
			 }
		 else if(ch >='a'&& ch<='z'  ||  ch >='A'&& ch<='Z'  ) {
			 System.out.println(ch +" char is conosants");
		 }
		 else {
			 System.out.println(ch +" char is invalid");
		 }
		 
       //method2
		  if(Character.isLetter(ch)) {
			  if(ch=='a'||  ch=='e' ||ch=='i'||ch=='o'||ch=='u'
						||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					 System.out.println(ch +"char is vowel");
					 }
			  else {
				  System.out.println(ch +" char is conosants");
			 }
		  }
		  if(Character.isDigit(ch)) {
			  System.out.println("the value of ch is number");
		  }
		  else {
			  System.out.println(ch +" char is invalid");
		  }
	}

}
