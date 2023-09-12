package javapractice;

public class object {

	public static void main(String[] args) {
         ex sc =new ex();
         sc.add();
         sc.sub();
         int var=sc.a;
         System.out.println(var);

	}

}
class ex  {
	int a=7;
	public void add(){
		System.out.println("addition" );
	}
	public void sub(){
		System.out.println("subtraction" );
	}
	
}