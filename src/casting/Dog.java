package casting;

public class Dog extends Animal {
    public String color;
    public Dog(String name, int age, String color){
       super(name, age);
       this.color = color;
    }
    public void dogInfo() {
       System.out.println("Dog class: ");
       System.out.println("Name: "+this.name);
       System.out.println("Age: "+this.age);
       System.out.println("Color: "+this.color);
    }
    
    public void legs() {
    	System.out.println("dog legs");
    }

 }

