package OOPConceptPart2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListVSHashTable {
	

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; //static array -- size is fixed
		
		//dynamic array -- ArrayList
		//1. can contain duplicate values
		//2. it maintains insertion order
		//3. it is not synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		//non generic ArrayList object
		ArrayList ar = new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());

		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//print all values of ArrayList using:-
		//1. for loop
		//2. iterator
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//generic ArrayList object
		//wrapper class is used
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("st1");
		ar2.add("st2");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
//		ar3.add();
		
		//Employee class objects
		Employee e1 = new Employee("ram", 27, "Dev");
		Employee e2 = new Employee("sara", 24, "QA");
		Employee e3 = new Employee("kisan", 25, "Admin");
		
		//create ArrayList
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		
		//iterator to traverse values
		
		Iterator<Employee> it = e.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println("-----");
		}
		
		//My logic for iterate all objects
		for(int i=0; i<e.size(); i++) {
			System.out.println((e.get(i)).name);
		}
		
		//addAll()
		
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		ar4.add(10);
		ar4.add(11);
		ar4.add(12);
		
		ArrayList<Integer> ar5 = new ArrayList<Integer>();
		ar5.add(13);
		ar5.add(14);
		ar5.add(15);
		
		ar4.addAll(ar5);
		
		Iterator<Integer> i = ar4.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ar4.removeAll(ar5);
		
		for(int i1=0; i1<ar4.size(); i1++) {
			System.out.println(ar4.get(i1));
		}
		
		ArrayList<Integer> ar41 = new ArrayList<Integer>();
		ar41.add(13);
		ar41.add(11);
		ar41.add(12);
		
		ArrayList<Integer> ar51 = new ArrayList<Integer>();
		ar51.add(13);
		ar51.add(14);
		ar51.add(15);
		
		ar41.retainAll(ar51);
		for(int p=0; p<ar41.size(); p++) {
			System.out.println(ar41.get(p));
		}
		
		
	}
	


}
