package OOPsConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		
		System.out.println(x+20);
		
		//data conversion String to integer
		int i = Integer.parseInt(x);//Integer is a wrapper class
		System.out.println(i+20);
		
		//wrapper classes: Integer, Double, Boolean
		
		//String to double
		String y="10.33";
		double d= Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String s= "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		//int to String
		int a=20;
		System.out.println(a+20);
		
		String s1=String.valueOf(a);
		
	System.out.println(s1+20);
	
	String u="100A";
//	Integer.parseInt(u); //numberFormatException error
		
	}
	
	
	
}
