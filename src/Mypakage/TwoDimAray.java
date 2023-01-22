package Mypakage;

public class TwoDimAray {

	public static void main(String[] args) {
		// Two Dimentional array
		String x[][]= new String[2][3];
		//another way of defining 2D array
		int y[][] = {{2,5,7},{3,5,9}, {8,7,6}};
		
		System.out.println(x.length);// will show no of rows in array
		System.out.println(x[0].length);// total no of columns in first row
		
		x[0][0] = "a";
		x[0][1] = "b";
		x[0][2] = "c";
		
		x[1][0] = "a1";
		x[1][1] = "b1";
		x[1][2] = "c1";
		
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[0][2]);
		
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		
		System.out.println("----------");
		
		//print all array values using for loop
		for(int r=0;r<x.length;r++) {
			for(int c=0; c<x[0].length; c++) {
				System.out.println(x[r][c]);
			}
		}
		
		
		
	}
	
	
}
