package casting;

public class CastingTutorial {

	public static void main(String[] args) {
		//upcasting
		//parent method is overridden by child method if both have same method
		Animal animal = new Dog("Leo", 2, "Black");
		animal.legs();
		
		// down casting
		//for performing this first upcasting is compulsory, otherwise at run time 
		//classCastException will come
		// both parent and chlid method/properties available
		Dog dog1 = (Dog) animal; // implicit casting Object of student to person
		dog1.animalInfo();
		dog1.dogInfo();

		

	}

}
