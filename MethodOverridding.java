package javapractice;


 class A{
	public   void name()
	{
		System.out.println("print name");
	}
	public  static void name1()
	{
		System.out.println("print name1 ");
	}
	public void name2()
	{
		System.out.println("print name2 ");
	}
	public void name3()
	{
		System.out.println("print name3 ");
	}
}
 class B extends A{
	 @Override
	 public void name()
		{
		 super.name();
		
			System.out.println("print a override");
		}
	 public void name4()
		{
			System.out.println("print name4 ");
		}
}
public class MethodOverridding extends B {
	public void name5()
	{
		System.out.println("print name5 ");
	}
	
	

	public static void main(String[] args) {
		
		MethodOverridding  mc =new MethodOverridding();
		
		
		mc.name();
	//	mc.name1();
		mc.name2();
		mc.name3();
		mc.name4();
		mc.name5();
		
		

	}

}
