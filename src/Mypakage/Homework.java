package Mypakage;

// class keyword tells that Homework is a class
public class Homework {

//	 char a = 63;

	public static void main(String[] args) {
	
//		System.out.println(DataTypes.d);// global variable of DataTypes class accessed in Homework class
		Homework hw = new Homework();
//		System.out.println(hw.a);
	String name;
	double a;
	double b;
	double c;
	
	name = "Pratik";
	a = 12;
	b = 10;
	c = 20;
	System.out.println("Hello \"" + name);
	System.out.println("Sum of two numbers " + a +" + "+ b +" = "+(a+b));
	
	System.out.println("Before swapping a=" + a + " and b=" +b);
	b = b+a;
	a = b-a;
	b = b-a;
	System.out.println("After swapping a=" + a + " and b=" +b);
	
	a=10;b=20;c=30;
	a=b;
	b=c;
	c=a;
	System.out.println(a);
	System.out.println(c);
	 c=15;
	System.out.println(c);
	System.out.println(a);
	
	System.out.println("----");
	
	//count no of digits in a no
	int x= 1234;
	int givenDigit = x;
	int digitCount=1;
	while(x/10 != 0) {
		digitCount++;
		x = x/10;
	}
	
	System.out.println(1010);//integer literals with leading zeros are considered as octal numbers
	System.out.println("no of digits in '"+givenDigit+"' are :- " +digitCount);
	System.out.println(11/10);//
	
	System.out.println("----");
	System.out.println(trail);
	
	for(int i =1; i<=5; i++) {
		for(int j =1; j<=5;j++) {
			if(j==1 || j==5 || i==1 || i==5) {
				System.out.print('*');
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	
}

	static String trail;

}