package javapractice;

public class ProgMinMulti {

	public static void main(String[] args) {
		
		int arr[][]= {{5,6,7},{1,9,8},{1,2,3}};
		int min=arr[0][0];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
			
		}
		System.out.println(min);

	}

}
