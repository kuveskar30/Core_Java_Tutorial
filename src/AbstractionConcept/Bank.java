package AbstractionConcept;

//abstract means we can't create object of class or it may be interface also
//Abstract class has atleast one abstract method(i.e. method without any implementation)
//abstract class also has non-abstract methods(i.e. methods with implementation)

//abstract class
public abstract class Bank {
	//in interface all variables are static,final,public by default
	//in abstract class we can have any kind of variable like static,non-static,final etc
	
//abstract class may have abstract as well as non abstract class	
	//in interface no need to use abstract keyword like in abstract class
	
	//this is partial abstraction, as all methods are not abstract
	//hiding implementation logic called as -- 'abstraction'
	//we can't create object of abstract class
	
	//In interface 100% abstraction is there, partial abstraction not allowed
	//but in abstract class partial abstraction is possible
	
	//abstract methods
	//abstract class method should not be private, as child class won't be able to access this method
	public abstract void loan();
	
	
	//non abstract methods
	public void credit() {
		System.out.println("Bank -- credit method");
	}
	
	public void debit() {
		System.out.println("Bank -- debit method");
	}
	
	
}
