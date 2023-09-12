package javapractice;

public class AccesSpecifer {
	public static void app1() {
		  System.out.println("public accesspecifier");//access any where
	  }
	private static void app2() {
		  System.out.println("private accesspecifier");//class level
	  }
	protected static void app3() {
		  System.out.println("protected accesspecifier");//package level with only related clas
	  }
	 static void app4() {
		  System.out.println("default accesspecifier");//package level
	  }

	public static void main(String[] args) {
		
		AccesSpecifer.app1();
		AccesSpecifer.app2();
		AccesSpecifer.app3();
		AccesSpecifer.app4();
		  
	  

	}

}
