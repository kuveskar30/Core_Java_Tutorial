package ScannerClass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Enter name");
		 String name = s.next();
		
		 System.out.println("Enter age");
		 int age = s.nextInt();
		 
		 System.out.println("Enter gender");
		 char sex = s.next().toUpperCase().charAt(0);
		 
		 System.out.println("name = " + name);
		 System.out.println("age = " + age);
		 System.out.println("Gender = " + sex);
	}

}
