package OOPsConceptsPart1;

public class Car {

	// Class/global variables
	int modelYear;
	int noOfWheels;
	/* these variables will be assigned to every object created inside
	main method as properties of those objects */
	
	public static void main(String[] args) {
		//now we will create object of car class
		Car a = new Car();// new Car() is Object and a is Object reference variable
		Car b = new Car();
		Car c = new Car();
		
		// new Car() --> this represents an Object of car class
		// a, b, c are not objects they are --> Object reference variables they are just representing objects
		// new keyword is used to create an Object
		
		a.modelYear = 2022;
		a.noOfWheels = 4;
		
		b.modelYear = 2020;
		b.noOfWheels = 4;
		
		c.modelYear = 1990;
		c.noOfWheels = 3;
		
		System.out.println(a.modelYear);
		System.out.println(a.noOfWheels);
		
		System.out.println(c.modelYear);
		System.out.println(c.noOfWheels);
		
		System.out.println("after changing reference variables");
		
		a=b;
		b=c;
		c=a;// c will also refer b because a is referring b now
		
		a.modelYear=10;
		System.out.println(a.modelYear);
		c.modelYear=20;
		System.out.println(c.modelYear);
		System.out.println(a.modelYear);// output will  be 20 and not 10
	}
	
	
	
}
