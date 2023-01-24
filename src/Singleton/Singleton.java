package Singleton;

//Singleton pattern/approach

//In OOP, Singleton class is a type of class which have only one object(instance of the class) at a time
//if we try to create a new instance(i.e. new object) it will point to the same object only

//How to design Singleton class:-
//1. make constructor as private
//2. write a static method that has return type as object of this Singleton class(Lazy Initialization)

public class Singleton {

	private static Singleton Singleton_instance = null;
	public String str;

	private Singleton() {
		str = "I'm using Singleton class pattern";
	}

	public static Singleton getInstance() {
		if (Singleton_instance == null) {
			Singleton_instance = new Singleton();
		}
		return Singleton_instance;
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
