package OOPConceptPart2;

public interface USBank {

	//in interface we can declare variables
	//and variables are by default static in nature, no need to write static keyword
	//value of variable will not change it is constant/final
	int min_bal = 100;
	
	//no main method
	//interface don't have static methods, only non static methods are there
	//because they are part of objects, and object doesn't have static method
	
	//in interface we don't give method body
	//only method declaration, only method prototype
	public void credit();
	public void debit();
	public void transferMoney();
	
	//it is abstract in nature
	//we can't create object of interface, we can't instantiate
	
	
	
}
