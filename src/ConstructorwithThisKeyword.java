
public class ConstructorwithThisKeyword {

	String name;
	int age;
	int a=2;

	ConstructorwithThisKeyword(String name, int age) {
		//we are assigning local variable values to global variable using this keyword
		//this refers to current object -- it refers on class level
		this.name = name;
		this.age = age;
	} 
	
	public void thisDemo() {
		int a=3;
		System.out.println(a);
		//we are accessing class level(i.e. global variable using this keyword here
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		ConstructorwithThisKeyword obj1 = new ConstructorwithThisKeyword("ajit", 26);
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		obj1.thisDemo();

		ConstructorwithThisKeyword obj2 = new ConstructorwithThisKeyword("kiran", 24);
		System.out.println(obj2.age);
		System.out.println(obj2.name);

	}

}
