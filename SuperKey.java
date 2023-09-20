package javapractice;

public class SuperKey extends ThisKeyword{
	
	

	
	
	SuperKey(int age, String name) {
		super(age,name);
		// TODO Auto-generated constructor stub
	}

	public void display() {
		super.display();
		System.out.println(age +","+name);
		System.out.println(super.age +","+super.name);
		
	}

	public static void main(String[] args) {
		
		SuperKey key1=new SuperKey(12,"john");
		key1.display();
		
	}

}
