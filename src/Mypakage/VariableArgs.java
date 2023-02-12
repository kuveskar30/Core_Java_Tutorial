package Mypakage;

public class VariableArgs {
	// Java program to demonstrate varargs

	// Driver code
	public static void main(String args[]) {
		// Calling the varargs method with
		// different number of parameters

		// one parameter
		myMethod("one params",100);

		// four parameters
		myMethod("four params",1,2,3,4);

		// no parameter
		myMethod("zero paras of varargs");
	}

	// zero or more String objects (or a single array of them) may be passed
	// as the argument(s) for this method.
	static void myMethod(String s, int... a) {
		System.out.println(s);
		System.out.println("Number of arguments: " + a.length);

		// using for each loop to display contents of a
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
	
	//Important Note: The argument(s) passed in this way is always an array - even if 
	//there's just one. Make sure you treat it that way in the method body.

	//Important Note 2: The argument that gets the ... must be the last in the method 
	//signature. So, myMethod(String s, int... a) is okay, but 
	//myMethod(int... i, String s) is not okay.

}
