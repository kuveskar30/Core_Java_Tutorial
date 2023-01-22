package Exeption_handling;

public class ExceptionHandling {
	int a = 10;
//	static ExceptionHandling obj;
	public static void main(String[] args) {
		
		//uncaught exception
//		int i = 9/0;
//		System.out.println(i);
		
		//caught exception
//		Thread.sleep(2000);
		  
//		null pointer exception
//		ExceptionHandling obj = new ExceptionHandling();
//		obj =null;// 
//		System.out.println(obj.a);// I removed obj reference by assigning null value to it so it is not pointing to any object
		
//		ExceptionHandling obj;
//		System.out.println(obj.a);
		
//		try {
//			int i = 9/0;
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		
		
		
		
		
		//every time we will no be knowing that which kind of exception will come,
		//so we use Throwable class which is superclass of exception and error
		//we can also use Exception class but Throwable will take care of both Exception and Error
		try {
			int i = 9/0;
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("hello");
		
	}
	
	
	
}
