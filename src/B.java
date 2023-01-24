
public class B extends ConstructorWithSuperKeyword {

	String name = "B constructor class name";
	
//first parent constructor gets executed, then child	
	public B() {
		System.out.println("child constructor B");
	}
	//use of super keyword for constructors
	public B(int i) {
		// super keyword must be written in first line, we can't use 2 super keywords
		super(i);// calls parent constructor having some parameter/argument
		// we can also give multiple parameters to super keyword
		// if we don't use super keyword then default parent constructor will get called

		System.out.println("child constructor one param i="+i);

	}

	public static void main(String[] args) {

		B obj = new B(10);
		obj.getName();
		obj.getData();

	}
	
	//use of super keyword for variables
	public void getName() {
		//here super keyword can be written in any line and any no of times
		System.out.println(super.name);
		System.out.println(name);
		System.out.println(super.name);
	}
	//use of super keyword for methods
	public void getData() {
		super.getData();//here super keyword can be written in any line and any no of times
		System.out.println("B getData method");
		super.getData();
	}

}
