package javapractice;

public class operators {

	public static void main(String[] args) {
		//Arithmetic Operators
		System.out.println("arithmetic operator");
		int a=2;
		int b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("assignment operator");
		 //Assignment Operators =, +=, -=, *=, /=, %=
	     int c=2;
		int d=3;
		System.out.println(a=c);
		System.out.println(a+=c);
		System.out.println(a*=b);
		System.out.println(a/=d);
		System.out.println(a%=b);
		
		System.out.println("inc and dec operator");
		 //Auto-increment Operator and Auto-decrement Operators
		
		int s=a++;
		int m=a--;
		int s1=++a;
		int m1=--a;
		
		System.out.println(s +" "+m+" "+s1+" "+m1 );
		
		System.out.println("logical operator");
		 //Logical Operators &&, ||, !
		
		boolean a1=true;
		boolean b1=false;
		
		System.out.println(a1 && b1);
		System.out.println(a1 || b1);
		System.out.println(!a1);
		
		System.out.println("relational operator");
		 //Comparison (relational) Operators ==, !=, >, <, >=, <=
		
		int d1=100;
		int c1=200;
		
		System.out.println(d1 == c1);
		System.out.println(d1 != c1);
		System.out.println(d1 > c1);
		System.out.println(d1 < c1);
		System.out.println(d1 >= c1);
		System.out.println(d1 <= c1);
		
		System.out.println("bitwise operator");
		
		 //Bitwise Operators &, |, ^, ~, <<, >>
		
		int a2=11;
		int b2=21;
		
		System.out.println(a2 & b2);
		System.out.println(a2 | b2);
		System.out.println(a2 ^ b2);
		System.out.println( ~ a2);
		System.out.println(a2 >>2);
		System.out.println(a2 << 2);
		
		System.out.println("ternary operator");
		// Ternary Operator ?:
		
		
		int num1 = 10;
		int num2 = 50;
		
		int n1=(num1>num2)?num1:num2;
		System.out.println(n1);
		
		int n2=(num1<num2)?num1:num2;
		System.out.println(n2);
		
		
		

	}

}
