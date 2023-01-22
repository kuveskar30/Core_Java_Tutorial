package Mypakage;

public class LoopsCocepts {

	public static void main(String[] args) {

		// 1. While loop
		/*
		 * if we don't give incremental/decremental part while loop will execute
		 * infinite times
		 */

		// print 1 to 10 numbers
		int i = 1; // initialization part
		while (i <= 10) { // conditional part
			System.out.println(i);// logic
			i = i + 1;// incremental/decremental part
		}
		System.out.println("------while loop above--------");

		// 2. for loop

		for (int j = 1; j <= 10; j = j + 1) {// initialization, condition, increment/decrement
			System.out.println(j);
		}

		System.out.println("--------------");

		for (int k = 10; k >= 1; k = k - 1) {// initialization, condition, increment/decrement
			System.out.println(k);// logic
		}
		
		
		//foreach loop
		int[] ia = {1,5,9,32};
		
		for(int k: ia) {
			System.out.println(k);
		}

		System.out.println("--------------");
		// 3. do while loop
		// irrespective of condition, this loop gets executed atleast once

		
		//do while loop executes atleast one time
		int k = 1;

		do {
			System.out.println(k);
			k++;
		} while (k <= 10);// semicolon is there in do while at end of while
		
		
		

	}

}
