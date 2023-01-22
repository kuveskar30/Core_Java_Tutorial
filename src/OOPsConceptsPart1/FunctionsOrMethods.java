package OOPsConceptsPart1;
//Functions and methods are the same things
public class FunctionsOrMethods {

	/* JAVA compiler looks for main methods and executes it by default,
	it will not execute methods other main method directly*/
	//main method is void because we never write return statement in it(it never return any value)
	//to use methods other than main method we have to create an object
	public static void main(String[] args) {
		FunctionsOrMethods obj = new FunctionsOrMethods();
		//when we create an object, copy of all non static methods will be given to it
		//and also main method(which is static) will not be given to object, object can't hold static methods
		//only non static methods will be given to object
	
		obj.test();
		int l=obj.pqr();
		System.out.println(l);
		String f=obj.qa();
		System.out.println(f);
		int k=obj.division(30, 10);
		System.out.println(k);
	}
	
	//non static methods
	
	//void-- doesn't return any value
	// return type of test() method is void
	//we have created test() method here, void means test() method returning nothing
	public void test() {//no input, no output(i.e. no return by this method)
		System.out.println("Test Method");
	}
	
	//return type of pqr() method is int
	// instead of void we have written int here, because pqr() function is returning 'c' which has data type int
	public int pqr() {//no input, some output
		System.out.println("PQR Method");
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		
		return c;//whenever return some data, replace void by data type of return data
	}
	
	//here return type is String
	public String qa() {//no input, some output
		System.out.println("qa method");
		String s="selenium";
		
		return s;//whenever return some data, replace void by data type of return data
	}
	
	//here return type -->int
	// x,y --> input parameters/arguments
	//one to one method
	public int division(int x, int y) {//some input, some output
		System.out.println("division method");
		int d;
		d=x/y;
		
		return d;//whenever return some data, replace void by data type of return data
	}
	//if we use void we can't use return statement and vice versa
	
}
