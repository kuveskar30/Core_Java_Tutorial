package OOPsConceptsPart1;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(45);
		obj.sum(45.33);
		obj.sum(10,5);
		System.out.println("main method");
	}
	
	public static void main(int i) {
		
		System.out.println("main method 1 parm");
	}
	
	public static void main(int x, int y) {
		System.out.println("main method 2 parm");
		
	}//we can overload main method also
	
	
//mehod overloading -- when method name is same with different arguments or diff data type or input parameters within same class
	
	public void sum() {// zero input parameter
		System.out.println("sum method -- with 0 parameter");
	}
	
	//we can't duplicate methods, (i.e. methods with same names)
	//we can't create method inside method
	
	//here we have provided parameter hence no error displayed although we created duplicate sum method 
	//this is called method overloading
	public void sum(int i) {//same name,one input parameter
		System.out.println("sum method -- with 1 parameter");
		System.out.println(i);
	}
	
	public void sum(double i) {//same name,one input parameter
		System.out.println("sum method -- with 1 parameter but diff data type");
		System.out.println(i);
	}
	
	public void sum(int x, int y) {//same name,two input parameter
		System.out.println("sum method -- with 2 parameter");
		System.out.println(x+y);
	}
	
	//we have created overloaded methods, by giving more no of parameters
	
	
}
