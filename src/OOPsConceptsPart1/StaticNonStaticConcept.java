package OOPsConceptsPart1;

public class StaticNonStaticConcept {

//	global variable: scope is throughout the function but with some conditions
	// e.g. for static variables direct calling is enough, for non static object should be created
	
	String name = "tom";//non static global variable
	static int age = 25;//static global variable
	// if not assigned value static variable show '0' value
	// for string it shows null value
	
	
	
	public static void main(String[] args) {
		//how to call static methods and variables
//		1. direct calling:
		sum();
//		2. calling by class name
		StaticNonStaticConcept.sum();
		
		//same is for static variables
		System.out.println(age);
		System.out.println(StaticNonStaticConcept.age);
		
		//how to call non static methods and variables?
		//for that create object
		//all non static methods and variables will be assigned to object
		
		
		StaticNonStaticConcept obj = new StaticNonStaticConcept();
		
		obj.sendMail();
		System.out.println(obj.name);
		
		/*static methods and variables can also be accessed through an object but this is not a good practice 
		because we can directly call these so why to create object */
		obj.sum();
		System.out.println(obj.age);
		
		//we can access static variables and methods directly but not the non static ones 
	
	}
	
	public void sendMail() {//non static method
		System.out.println("send mail method- - non static");
	}
	
	public static void sum() {//static method
		System.out.println("sum method -- static");
	}
	
}
