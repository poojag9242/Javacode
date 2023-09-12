package javapractice;

public class MethodOverloading {
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void add(long x, long y) {
		long z=x+y;
		System.out.println(z);
	}
	void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(c);
	}
	void add(float a,long b) {
		float m=a/b;
		System.out.println(m);
	}


	public static void main(String[] args) {
	
		MethodOverloading  mo=new MethodOverloading();
		mo.add(2, 3);
		mo.add(222222222, 333333333);
		mo.add(2, 3,4);
		mo.add(2, 3);
	}

}
