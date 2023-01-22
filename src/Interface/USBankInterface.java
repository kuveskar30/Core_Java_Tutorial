package Interface;

public interface USBankInterface {
	//*note, from java 8 onwards* :-
	//Interfaces can have default methods with implementation in Java 8 on later.
	//Interfaces can have static methods as well, similar to static methods in classes.
	//Default methods were introduced to provide backward compatibility for old interfaces so that they 
	//can have new methods without affecting existing code.
	
	
	//abstract means we can't create object of class or it may be interface also
	//In interface 100% abstraction is there, partial abstraction not allowed
	//implementation logic is hidden, only prototype of method is given
	//in interface no need to use abstract keyword like in abstract class
	
	//in interface we can declare variables
		//and variables are by default static in nature, no need to write static keyword
		//value of variable will not change it is constant/final
	// access modifier of interface variable is public
		int min_bal = 100;
		
		//no main method
		
		
		//in interface we don't give method body
		//only method declaration, only method prototype
		public void credit();
		public void debit();
		public void transferMoney();
		
		//it is abstract in nature
		//we can't create object of interface, we can't instantiate	

}
