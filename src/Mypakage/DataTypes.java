package Mypakage;

public class DataTypes {

	static int d = 10;

	public static void main(String[] args) {
		/*
		 * main() method --> starting execution point of a program, JAVA first looks for
		 * main method when we execute a program
		 */

		// primitive Data types (int, double, char, boolean)

		// 1.int (integer data type)
		int i;
		// Declaration, i is a variable
		// semicolon at end of statement is must
		i = 10;// initialization of a variable by assigning a value
		/*
		 * a memory location with name(i.e. address) 'i' is created and this location
		 * contains a value having integer data type and value is 10
		 */

		/*
		 * We can't declare same variable multiple times otherwise duplicate variable
		 * error will come
		 */
		int a, b; // declaring multiple variables in a single line
		a = 5;
		b = 15;

		// 2.double (stores fractional number up to 15 decimals)
		double d, d1;/*
						 * yellow underline below d1 is there because d1 variable is not used in this
						 * project, if we create variable and don't use it then memory will get wasted
						 */
		d = 10.33;
		d1 = 100;

		// 3. char (may contain special symbols, numbers or alphabets)
		char c, c1, c2, c3; // character must be written in single quote
		// contains single value
		c = 'a';
		c1 = 'A';
		c2 = '$';
		c3 = '4';

		// 4. boolean (true or false)
		// true and false are both values and keywords
		// keyword is a reserved word in JAVA which has a special function
		boolean b1, b2;
		b1 = true;
		b2 = false;

		// 5. String (it is not a Data type it is a class)
		//String is an object which represents sequence of characters
		//two ways of creating strings 1. string literal 2. by using 'new' keyword
		
		// but can be used as a data type
		// written in double quotes
		
		//1. string literal
		String s, s1,s2; // S is capital
		s = "hello world yo";
		s1 = "10.63";
		s2= "10.63"; //for both s1 and s2 only one object will be created and 
		//both s1 and s2 will point to the same object
		
		//2. by using 'new' keyword
		String s3 = new String("hello");
		String s4 = new String("hello");//here two separate objects will be created for both s3 and s4
		
		String[] splitted_string = s.split(" ");
		System.out.println(splitted_string[0] + splitted_string[1] + splitted_string[2]);
		System.out.println("splitted string above");
		System.out.println("length=" + s.length());
		
		for(int j=0; j<s.length(); j++) {
			System.out.println(s.charAt(j));
		}

		// getting output on console
		// shortcut --> syso + ctrl + spacebar
		System.out.println(i);
		// System is a class, out means output
		// println is a method
		System.out.println(d);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(b1);
		System.out.println(a + b);

		/*
		 * variables whose values are not used in program a yellow warning sign is
		 * displayed on eclipse, because if we don't use those variables in program it
		 * is better to delete them, otherwise they will occupy unnecessary memory
		 */

	}

}
