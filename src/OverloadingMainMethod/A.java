package OverloadingMainMethod;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A main method");
		B.main(args);//calling B main method from A main method

	}

}
