
public class ConstructorConcept {

	//when we create object of a class constructor gets executed
	//constructor looks like a function, but it is not a function
	//it doesn't return any value
	//constructor name = class name
	
	//if we don't define any constructor with or without parameter. default
	//hidden constructor will get executed
	
	//if we define a constructor with parameter, we will also have to define
	//constructor with no parameter also, because in this case if we create
	//object with no parameter then hidden constructor will not be called and 
	//it will show error
	
	
	//Even if we don't create default constructor it is always there in hidden form 
	/* no static keyword, no void or any return type keyword while creating constructor, 
	 * only public keyword followed by classname */
	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	//we can overload constructor
	public ConstructorConcept(int i) {
		System.out.println("one parameter constructor");
		System.out.println("i = "+i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("two parameter constructor");
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
	
	
	
	public static void main(String[] args) {
	
		ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept(10);
		ConstructorConcept obj3 = new ConstructorConcept(15,30);
		
		
		
	}

}
