package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// Bmw class is publicly defined hence can be used from any class
		Bmw obj= new Bmw();
		
		//when parent and child class have same method name then child method will get executed
		//this is called method overriding(polymorphism)
		//static polymorphism(one to many) -- compile time polymorphism
		obj.start();
		obj.stop();
		obj.safety();
		obj.engine();
		System.out.println("-----");
		
		Car obj1 = new Car();
		
		obj1.start();
		obj1.stop();
		obj1.refuel();
		//we can't access method of child class from parent class
		//child can access parent
		
		System.out.println("-----**");
//		System.out.println(USBank.min_bal);
		
		//Top casting
		//dynamic polymorphism/runtime polymorphism
		//child class object can be referred by parent class object variable
		//by this, methods common to both class(overridden) and methods of parent class can be accessed
		Car c = new Bmw();
		
		c.start();
		c.stop();
		c.refuel();
		
		
		//down casting not allowed
		//Bmw b1 = (Bmw)new Car();//classCastException
	

	}

}
