package OverloadingMainMethod;

public class A {

	public static void main(String[] args) {
		
		String s[]= {"j","k"};
		System.out.println("A main method");
		B.main(s);//calling B main method from A main method
		

	}

}
