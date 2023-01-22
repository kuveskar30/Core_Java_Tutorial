package Mypakage;

public class Operators {

	public static void main(String[] args) {
		//semicolon at the end of statement is must except for class and methods
		// Variables
		//primitive data types
		int a,b; // if we declare and initialize variable but don't use in program the warning like sign is displayed
		
		char c;// declaration
		boolean d;
		double x;
		//derived data types
		String s;
		
		 a=109;//initialization
		 b=10;
		 c='P';
		 d=true;
		 x=101.6;
		 
		 s="Hello";
		 //String concatenation
		 System.out.println("value of 'a' is: "+ a + x + s +c+d);
		 System.out.println("-------------------");
		 
		 // Arithmetic operators +, -, /, %, *
		 System.out.println("Arithmetic operators:");
		 System.out.println("a is :"+a+ " b is :"+b);
		 System.out.println("b-a is :"+(b-a));
		 System.out.println("a+b is :"+(a+b));
		 System.out.println("a*b is :"+(a*b));
		 
		 System.out.println("a/b is :"+(a/b));
		 // int/int is a whole number
		 // int/double or double/int or double/double is fractional number
		 System.out.println("109/10 is :"+(109/10) +" ie int/int is a whole number and not a fractional");
		 System.out.println("109/10 is :"+(109/10));
		 System.out.println("109/10.0 is :"+(109/10.0)); 
		 // a and b are int types
		 //output is showed lowest integer division value
		 
		 System.out.println("a%b is :"+(a%b));
		 System.out.println("-------------------");
		 
		 //comparison or relational operators
		 // relational operators, always return boolean values
		 System.out.println("comparison/relational operators:");
		 System.out.println("a is :"+a+ " b is :"+b);
		 System.out.println("a==b is:"+(a==b));
		 System.out.println(a>b);
		 System.out.println(a<b);
		 System.out.println(a>=b);
		 System.out.println(a<=b);
		 System.out.println(a!=b);
		 
		 System.out.println("-------------------");
		
		 // Logical operators --> &&  ||  !
		 // works between two boolean values
		 // && ---> If both values true then returns true, otherwisw False
		 // || --> At least one value true the returns true, if both values false then returns false
		 // ! --> it is negation returns opposite value of given boolean values
		 System.out.println("a is :"+a+ " b is :"+b);
		 System.out.println("Logical operators");
		 System.out.println(a>b && b<a);
		 System.out.println(a>b || b<a);
		 System.out.println(!(a>b));
		 
		 System.out.println("-------------------");
		 
		 // Increment/ Decrement operators ++, --
		 a=10;
		 System.out.println("a is :"+a);
		 //pre increament
		 System.out.println("pre increment");
		 System.out.println(++a);
		 System.out.println(a);
		 
		 System.out.println("-------------------");
		 
		//post increament
		 a=10;
		 System.out.println("a is :"+a);
		 System.out.println("post increment");
		 System.out.println(a++);
		 System.out.println(a);
		 
		 System.out.println("-------------------");
		 
		 a=10;
		//pre decreament
		 System.out.println("a is :"+a);
		 System.out.println("pre decrement");
		 System.out.println(--a);
		 System.out.println(a);
		 
		 System.out.println("-------------------");
		 
		 
		//post decreament
		 a=10;
		 System.out.println("a is :"+a);
		 System.out.println("post decrement");
		 System.out.println(a--);
		 System.out.println(a);
		 
		 //assignment operators, assign value to a variable
}}
