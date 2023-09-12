package javapractice;
import java.util.Scanner;

public class ProgRevStr {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	   System.out.println("enter the string that you want to reverse");
	   String str=sc.nextLine();
		String s[]=str.split(" ");
		 String newstr=" ";
		 
		 for(int i=0; i<=s.length;i++) {
			 String spl=s[i];
		 
	    
	    for(int j=str.length()-1; j>=0;j--) {
	    	char ch =spl.charAt(i);
	    	newstr=ch+newstr;
	    }
	    newstr=newstr+' ';
		 }
	    System.out.println(newstr);	
	
	}

}
