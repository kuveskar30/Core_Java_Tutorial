package Exeption_handling;

public class ThrowsKeyword {

	public static void main (String[] args) throws Throwable{
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Hello");
		
		
		//Throw keyword, 
		try {
			throw new Exception("pratik custom Exception");
		}
		catch(Throwable t) {
			t.printStackTrace();
			System.out.println(t.getMessage());
		}
		
	}
	
	
	public void sum() throws Throwable{
		
		try {
			div();
		}
		catch(Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
	public void div (){
		
		int i = 9/0;
		
		
	}
	
	
}
