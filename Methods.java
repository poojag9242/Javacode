package javapractice;

public class Methods {

	public static void main(String[] args) {
		app sc=new app();
		sc.add();
		int res=sc.add1();
		System.out.println(res);
		sc.add2(3, 2);
		int res1= sc.add3(3, 2);
		System.out.println(res1);
		

	}

}
 class app  {
	//methods without arguments and without return type
	public void add() {
		int a=3 , b=2;
		int c=a+b;
		System.out.println(c);
	}
	
	//methods without arguments and with return type
	public int add1() {
		int a1=3 , b1=2;
		int c1=a1+b1;
		return c1;
	}
	
	//methods with arguments and without return type
	public void add2(int a2,int b2) {
		
		int c2=a2+b2;
	}
	//methods with arguments and with  return type
     public int add3(int a3,int b3) {
		int c3=a3+b3;
		return c3;
	
}
	
}