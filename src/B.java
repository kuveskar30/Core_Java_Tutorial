
public class B extends ConstructorWithSuperKeyword {

//first parent constructor gets executed, then child	
	public B() {
		System.out.println("child constructor");
	}

	public B(int i) {
		// super keyword must be written in first line, we can't use 2 super keywords
		super(i);// calls parent constructor having some parameter/argument
		// we can also give multiple parameters to super keyword
		// if we don't use super keyword then default parent constructor will get called

		System.out.println("child constructor one param");

	}

	public static void main(String[] args) {

		B obj = new B(10);
//		B obj = new B();

	}

}
