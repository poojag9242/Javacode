package javapractice;

public class ProgFact {

	public static void main(String[] args) {
            //factorial 0f 6!
		int n=5;
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);

	}

}
