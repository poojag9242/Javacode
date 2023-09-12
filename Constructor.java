package javapractice;

public class Constructor {

	public static void main(String[] args) {
		five f1=new five();
		 five f2=new five(2,3);
		

	}

}
class five{
	five (){
		System.out.println("this is constructor");
	}
	five (int a ,int b){
		System.out.println("this is parametric constructor");
	}
}

//constructor name should be same as class name
//it does n`t have any return type
//it will call when object is created