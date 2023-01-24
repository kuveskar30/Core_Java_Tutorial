package Mypakage;

public class VariableTypes {

	// Type of variables :-
	// 1. instance - specific to object instance
	// 2. local -specific to method
	// 3. static - specific to class, independent of object instance
	// all object refer to same static variable

	// these are instance variables--tied with objects
	// these are dependent on object instance
	// they have different values for different object instance
	// w.r.t. objects multiple copies of instance variables are created
	String name;
	int age;
	String city;

	// static variable is independent of object instance
	// className.staticVariableName no need to create object to access this type of
	// variable
	// all object refer to same static variable
	// only one copy of static variable is created
	static int i;
	static String country;
	// static block is used to initialize static variables
	static {
		i = 0;
		country = "india";
	}

	public VariableTypes(String name, int age, String city) {
		// name,age,city of constructor are local variable
		// their scope is limited to specific method/function only
		this.name = name;
		this.age = age;
		this.city = city;
		i++;
		System.out.println(i);
	}

	public void getCity() {
		System.out.println(city);
	}

	// static method are independent of object instance
	// all object share same static method
	// className.staticMethodName no need to create object to access this type of
	// method
	public static void getCountry() {
		// static method take only static variable
		System.out.println(country);
	}

	public static void main(String[] args) {

		// we are creating instance of class i.e. object of class
		// and on creating instance, instance variables also getting values through
		// constructor
		VariableTypes emp1 = new VariableTypes("raj", 26, "mumbai");
		VariableTypes emp2 = new VariableTypes("kiran", 25, "pune");

		emp1.getCountry();
		emp2.getCountry();

	}

}
