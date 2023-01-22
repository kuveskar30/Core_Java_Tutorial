package Encapsulation;

public class EmployeeData {
	// encapsulation helps to hide data from outside access

	// how to implement encapsulation/data hiding

	// 1. private data variables: so that these variables can't be accessed from
	// outside
	private int id;// private, public are access modifiers
	private String name;
	public String city = "mumbai";

	public static void main(String[] args) {
		EmployeeData emp1 = new EmployeeData();

		emp1.setId(1);
		emp1.setName("kiran");
		System.out.println(emp1.getId() + " " + emp1.getName());
	}

	// getter and setter methods: to get and set values of the private variables
	// getter and setter should be public so it can be accessed from outside of
	// class
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
