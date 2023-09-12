package javapractice;

import java.util.Scanner;

public class Exceptions {
	
	//arithmetic Exception
	
	public static void E1() {
		int a=12;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		System.out.println("hello");
		
	}
	
	//Nullpointer Exception
public void E2() {
	String  s1=null;
	int length=s1.length();
	System.out.println(length);
		
	}

   //ArrayIndexOutBound Exception
public void E3() {
	int arr[]=new int[3];
	 arr[0]=12;  arr[1]=92;  arr[2]=32;
	 System.out.println(arr[5]);
	
}

  //stringIndexOutOfBound Exception
public void E4() {
String s="java";
System.out.println(s.charAt(5));
}
    
//NumberFormat Exception
public static void E5(){
	
	String s2="123";
	int a1=Integer.parseInt(s2);
	int a2=a1+2;
	System.out.println(a2);
	
	
	String s3="pooja";
	int p=Integer.parseInt(s3);
	int q=p+2;
	System.out.println(q);
	
}

//InputMismatch Exception
public static void E6() {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the input");
    int num=sc.nextInt();	
    System.out.println(num);
}

	public static void main(String[] args) {
		E1();
		//E2();
		//E3();
		//E4();
		//E5();
		//E6();

	}

}
