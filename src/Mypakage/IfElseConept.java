package Mypakage;

public class IfElseConept {

	public static void main(String[] args) {
		
		int a,b,c;
		a=500; b=800; c=900;
		System.out.println("a="+a+ " b="+b+ " c="+c);
		
		//highest from two numbers
		
		//nested if-else
		if(a==b) {
			System.out.println("Both are same");
		}
		else if(a>b) {
		System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		
		//highest from three numbers
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
		
		
		//Switch case statement
		//If we have condtn more than 5 the use this statement
		
		int day=1;
		
		switch(day) {//day is an expression, value of expression will be compared with case values and respective case will be executed
		case 1 : System.out.println("Sunday");
										break; //break will stop switch loop and come out of switch
		case 2 : System.out.println("Monday");
										break;
		case 3 : System.out.println("Tuesday");
										break;
		case 4 : System.out.println("Wednesday");
										break;
		case 5 : System.out.println("Thursday");
										break;
		case 6 : System.out.println("Friday");
										break;
		case 7 : System.out.println("Saturday");
										break;
		default: System.out.println("Invalid day number!");//If no case executed default will get executed
		}
		
		
	}
}
