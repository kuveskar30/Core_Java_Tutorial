package Mypakage;

public class AccessModifiers {
//default, public, private, protected

	// 1. default: can be accessed within only same package
	int i1 = 0;// this variable has access modifier as default

	void demo1() {
		System.out.println("this is method with default access modifier");
	}

	// 2. public: can be accessed within any package
	public int i2 = 1;// this variable has access modifier as public

	public void demo2() {
		System.out.println("this is method with public access modifier");
	}

	// 3. private: can be accessed within class only and not outside of class
	private int i3 = 2;// this variable has access modifier as private

	private void demo3() {
		System.out.println("this is method with private access modifier");
	}

	// 4. protected: can be accessed within same package and
	// also outside of package but by only through inheritance
	// protected = default + other package through inheritance
	protected int i4 = 2;// this variable has access modifier as protected

	protected void demo4() {
		System.out.println("this is method with private access protected");
	}
}
