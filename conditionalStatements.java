package javapractice;

public class conditionalStatements {

	public static void main(String[] args) {
		//if statements
		 int age=19;
		if(age>=18) {
			System.out.println("your are eligible to vote");
		}
		
		//nested if statements
		
		if(age>0) {
			System.out.println("age is greater than zero");
			
			if(age>=18) {
				System.out.println("your are eligible to vote");
			}
		}
		
		//if else 
		
		if(age>=18) {
			System.out.println("your are eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
		
		//switch case
		int week=5;
		switch(week) {
		case 1:
		System.out.println("sunday");
		break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thrusday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
			default:
			System.out.println("provide valid week");
		}
		
		
		//maths = 60 sci=50 eng=40
		int maths=62 ,sci=45,eng=79,french=45;
		if(maths>=60 && sci>=50  && eng>=40 || french>=35) {
			System.out.println("pass");
			}
		else {
			System.out.println("fail");
		}

	}

}
