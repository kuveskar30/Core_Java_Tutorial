package Mypakage;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		/*
		 * Array : can store similar and multiple data type values in a single variable
		 */

		// Disadvantages of array:
		// 1. fixed size -- static array
		/*
		 * to overcome point 1. we use Collection framework -- ArrayList, HashTable use
		 * dynamic array
		 */
		// 2. stores only similar data types
		// to overcome point 2. we use Object Array

		// One dimentional array
		// 1. int array
		// lowest bound/index = 0
		// upper bound/index = n-1 (n = size of array)
//		Object j[] = new Object[8];
		int i[] = new int[4];// array is an object because it is created with new keyword
//		int[] i = new int[4];	

		i[0] = 5;
		i[1] = 10;
		i[2] = 20;
		i[3] = 30;
		
		//another way for defining array
		//array literal
		int[] i1 = {1,2,3,4};
//		
//		System.out.println(i11[]);

		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);

		System.out.println(i);
		System.out.println(Arrays.toString(i));
		// System.out.println(i[4]);// arrayIndex out of bound exception error will come
		System.out.println(i.length);// print array size/length

		// print all elements of array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// 2. double array
		double d[] = new double[3];
		d[0] = 10;
		d[1] = 10.2;
		d[2] = 10.3;

		System.out.println(d[0]);

		// 3. char array
		char c[] = new char[2];
		c[0] = 'A';
		c[1] = 'a';

		// 4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		// 5. String array
		String s[] = new String[2];
		s[0] = "hello";
		s[1] = "world";

		System.out.println(s.length);
		System.out.println(s[1]);
		System.out.println(s);
		System.out.println(Arrays.toString(s));

		// Object Array
		// object is a class
		// it can store multiple data types
		Object ob[] = new Object[3];

		ob[0] = "ram";
		ob[1] = 175;
		ob[2] = 88.60;
		System.out.println(ob);
		System.out.println(Arrays.toString(ob));

		for (int a = 0; a < ob.length; a++) {
			System.out.println(ob[a]);
		}

		System.out.println("********");

		// for each loop, for(int element : arrayName){}
		for (Object ob1 : ob) {
			System.out.println(ob1);
		}

	}

}
