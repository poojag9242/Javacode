package javapractice;

public class StringMethods {

	public static void main(String[] args) {
		String s1="hello";
		
		String s2=new String("I am working for shimakh technology");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//Strings methods
		// 1.	Length (); 
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//2.	Equals ();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("hello"));
		
		//3.	EqualsIgnorecase();
		System.out.println(s1.equalsIgnoreCase("heLLo"));
		
		//4.	ToUpperCase();
		System.out.println(s1.toUpperCase());
		
		//5.	ToLowerCase();
		System.out.println(s1.toLowerCase());
		
		//6.	StartWith();
		System.out.println(s1.startsWith("he"));
		System.out.println(s2.startsWith("I am"));
		System.out.println(s1.startsWith("hai"));
		System.out.println(s2.startsWith(" am"));
		
		//7.	EndsWith();
		System.out.println(s1.endsWith("llo"));
		System.out.println(s2.endsWith("technology"));
		System.out.println(s1.endsWith("hell"));
		System.out.println(s2.endsWith("am"));
		
		//8.	indexOf();
		System.out.println(s1.indexOf("l"));
		
		
		//9.	LastindexOf();
		System.out.println(s1.lastIndexOf("l"));
		
		//10.	CharAt();
		System.out.println(s1.charAt(3));
		System.out.println(s2.charAt(6));
		
		//11.	Replace();
		System.out.println(s1.replace("hello" , "hai"));
		

		//12.	Contains();
		System.out.println(s1.contains("am"));
		
		//13.	Substring();
		System.out.println(s2.substring(4,9));
		
		
		//14.	IsEmpty();
		System.out.println(s1.isEmpty());
		
		
		//15.	Split(); // i am working in shimakh tech
		String[] s3 =s2.split(" ");
		for(int i=0;i<=s3.length-1;i++)
		System.out.println(s3[i]);
		
		                                   
		//16.	Trim();
		System.out.println(s2.trim());
		
		//17.	Concat();
		System.out.println(s1.concat("hai"));
		

		 


	}

}
