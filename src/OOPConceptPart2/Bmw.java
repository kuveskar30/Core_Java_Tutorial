package OOPConceptPart2;

public class Bmw extends Car{//Bmw will inherit properties and methods of Car class by extends keyword
	
	public void start() {//overridden method
		System.out.println("BMW start method");
	}
	
	public void safety() {
		System.out.println("BMW safety method");
	}
}
