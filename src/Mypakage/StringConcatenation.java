package Mypakage;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		
		int a,b;
		a=100;
		b=200;
		
		String s1,s2;
		 s1= "Hello ";
		 s2="World";
		 
		 double d1,d2;
		 d1=10.33;
		 d2=20.21;
		 
		//program execute from left to right
		System.out.println(a+b);
		System.out.println(s1+s2);
		System.out.println(a+b+s1+s2);
		
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		
		System.out.println(a+b+s1+s2+a+b);
		System.out.println(s1+s2+a+b+d1+d2);
		// '+' is concatenation operator
		
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		System.out.println("addition of a and b is:"+(a+b));
		
		//println vs print
		
		//println prints and creates a new line
		//print will not create new line
		System.out.println("hello selenium1");
		System.out.println("hello testing");
		
		System.out.println("Hello selenium2");
		System.out.print("Hello testing");
		System.out.println("yo yo");
		
		System.out.print("Hello selenium3");
		System.out.println("Hello testing");
		
	}
}
