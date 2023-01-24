package FinallyConcept;

public class FinallyKeyword {

	public static void main(String[] args) {
		test1();

	}
	
	public static void test1() {
		try {
			System.out.println("inside try"); 
			throw new Exception("my custom exception");
		}
		catch(Throwable t) {
			System.out.println("inside catch");
		}
		finally //followed after try although script fail it get executed
		{
		System.out.println("hello");
		}
	}

}
