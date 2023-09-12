package javapractice;

public class ProgSortS6 {

	public static void main(String[] args) {
		String str[]= { "apple" , "cat" , "dog" ,"bat"};
         String temp;
         for(int i=0; i<str.length;i++) {
        	 for(int j=i+1; j<str.length;j++) {
        		if(str[i].compareTo(str[j])>0) {
        			temp=str[j];
        			str[j]=str[i];
        		   str[i]=temp;
        		}
        	 }
        	 System.out.println(str[i]);
         }
	}

}
