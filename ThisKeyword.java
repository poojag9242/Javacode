package javapractice;

public class ThisKeyword {
	int age ;
	String name ;
	
	ThisKeyword(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	public void display() {
		System.out.println(age +","+name);
	}

	public static void main(String[] args) {
		
		ThisKeyword key=new ThisKeyword(21,"surya");
	      key.display();
		

	}

}
