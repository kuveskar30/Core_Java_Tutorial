
public class ConstructorWithSuperKeyword {
	
	//use of super keyword with
	//1. variables
	//2. methods
	//3. constructors

	String name ="ConstructorWithSuperKeyword class name";
	
	public ConstructorWithSuperKeyword() {
		System.out.println("parent default constructor ConstructorWithSuperKeyword");
	}
	
	public ConstructorWithSuperKeyword(int i) {
		System.out.println("parent ConstructorWithSuperKeyword, one parameter i="+i);
	}
	
	public void getData() {
		System.out.println("ConstructorWithSuperKeyword getData method");
	}

}
