package OOPsConceptsPart1;

public class CallByValueAndReference {

	int p,q;
	
	public static void main(String[] args) {
		
		CallByValueAndReference obj = new CallByValueAndReference();
		int i =obj.testSum(10, 5);//call by value or pass by value
		System.out.println(i);
		obj.p=500;
		obj.q=60;
		
//		after swap
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	
	public int testSum(int a, int b) {
//		a=9;b=8;
		return (a+b);
	}
	
	
	public void swap(CallByValueAndReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
	
	
}
