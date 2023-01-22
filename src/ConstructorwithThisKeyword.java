
public class ConstructorwithThisKeyword {

	String name;
	int age;

	ConstructorwithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
	} 

	public static void main(String[] args) {

		ConstructorwithThisKeyword obj1 = new ConstructorwithThisKeyword("ajit", 26);
		System.out.println(obj1.age);
		System.out.println(obj1.name);

		ConstructorwithThisKeyword obj2 = new ConstructorwithThisKeyword("kiran", 24);
		System.out.println(obj2.age);
		System.out.println(obj2.name);

	}

}
