package OOPsConceptsPart1;

public class LocalVsGlobalVariable {
	
	//Global variables -- Class variables
	
			String name = "ram";
			int age = 25;
	
	
	public static void main(String[] args) {
		
		 int i=10;
		 System.out.println(i);//local variable
		 
		 //if we want to print value of global variable we will have to create an object of that respective class
		 //all global variable and  non static methods are applied to an object
		 LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		 System.out.println(obj.name);
//		 System.out.println(obj.age); 
		 obj.sum();
		 
		
		
	}
	
	//non static method
	public void sum() {
		int i,j;
		i=10;
		j=20;
		int age = 26;
				System.out.println(age);; //i,j,age are local variables their scope is within sum() method only
	}
	

}
