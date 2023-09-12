package javapractice;

public class ProgPrint_1 {

	public static void main(String[] args) {
	
         int arr[]= {12,13,14,44};
         int size=arr.length;
         System.out.println("integer array");
         for (int arr1:arr) {
        	 System.out.print(arr1+" ");
        	}
         System.out.println(" ");
	
	
	String str[]= {"suresh" ,"selenim","project","training"};
	int size1=str.length;
	System.out.println("string array");
	
	for (int i=0;i<=size-1;i++) {
		System.out.print(str[i]+ " ");
		
	 }
	System.out.println(" ");
	 for (String str1:str) {
    	 System.out.print(str1 + " ");
     }

	
	
	 
	 
	}
}
