package OverloadingMainMethod;

public class TestMain {

	public static void main(String[] args) {

		System.out.println("main method 1");
		
		main("hello");
		main(1);
		main(156, 45);
	}

	public static void main(String args) {

		System.out.println("main method 2");
	}

	public static void main(int i) {

		System.out.println("main method 3");
	}
	
	public static void main(int i, int j) {

		System.out.println("main method 4");
	}

}
