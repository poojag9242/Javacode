package javapractice;

public class TypesOfVar {
	int  a =6;//instance var
	static int b=5;  // static instance variable
	public void car() {  //non static method
		int s=5;     //local variable
		System.out.println("this is a non static method");
		System.out.println("s is local var"+" "+ s);
	}
	public static void bike() {    //static method
		 int m=5;  //local variable
		System.out.println("this is a static method");
		System.out.println("m is local var"+" "+ m);
	}

	public static void main(String[] args) {  //exection starts here
		
//typesofvar class
		System.out.println("Main class");
		//accesing static members
		System.out.println(b);
		bike();
		
		//accesing non static members
		TypesOfVar sc =new TypesOfVar();
		System.out.println(sc.a);
		sc.car();
		
//ademo class
		System.out.println();
		System.out.println("ademo class");
		System.out.println();
		//accesing static members
				System.out.println(ademo.b);
				ademo.moon();
				
				//accesing non static members
				ademo sc1 =new ademo();
				System.out.println(sc.a);
				sc.car();
				
//bdemo class   System.out.println();
				System.out.println("bdemo class");
				System.out.println();
				//accesing static members
						System.out.println(bdemo.b);
						bdemo.bike();
						
				//accesing non static members
						bdemo sc2 =new bdemo();
						System.out.println(sc.a);
						sc.car();
						
//cdemo class
						System.out.println();
						System.out.println("cdemo class");
						System.out.println();
                          //accesing static members
								System.out.println(cdemo.b);
								cdemo.bike();
								
								//accesing non static members
								cdemo sc3 =new cdemo();
								System.out.println(sc.a);
								sc.car();
								
//demo class
								System.out.println();
								System.out.println("demo class");
								System.out.println();
								//accesing static members
										System.out.println(demo.b);
										demo.bike();
										
										//accesing non static members
										demo sc4 =new demo();
										System.out.println(sc.a);
										sc.car();
										
	}

}
class ademo{
	String  a ="hai";//instance var
	static String b="hello";  // static instance variable
	public void car() {  //non static method
		int s=5;     //local variable
		System.out.println("this is a non static method");
		System.out.println("s is local var"+" "+ s);
	}
	public static void moon() {    //static method
		 int m=5;  //local variable
		System.out.println("this is a static method");
		System.out.println("m is local var"+" "+ m);
	}
	
}
class bdemo{
	int  a =6;//instance var
	static int b=5;  // static instance variable
	public void car() {  //non static method
		int s=5;     //local variable
		System.out.println("this is a non static method");
		System.out.println("s is local var"+" "+ s);
	}
	public static void bike() {    //static method
		 int m=5;  //local variable
		System.out.println("this is a static method");
		System.out.println("m is local var"+" "+ m);
	}
	
}
class cdemo{
	int  a =6;//instance var
	static int b=5;  // static instance variable
	public void car() {  //non static method
		int s=5;     //local variable
		System.out.println("this is a non static method");
		System.out.println("s is local var"+" "+ s);
	}
	public static void bike() {    //static method
		 int m=5;  //local variable
		System.out.println("this is a static method");
		System.out.println("m is local var"+" "+ m);
	}
	
}
class demo{
	int  a =6;//instance var
	static int b=5;  // static instance variable
	public void car() {  //non static method
		int s=5;     //local variable
		System.out.println("this is a non static method");
		System.out.println("s is local var"+" "+ s);
	}
	public static void bike() {    //static method
		 int m=5;  //local variable
		System.out.println("this is a static method");
		System.out.println("m is local var"+" "+ m);
	}
	
}