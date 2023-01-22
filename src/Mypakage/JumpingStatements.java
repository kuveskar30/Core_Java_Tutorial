package Mypakage;

public class JumpingStatements {

	public static void main(String[] args) {
		
		//1. break
		
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				break;//if i ==5 loop will break
			}
			System.out.println(i);
		}
		
		System.out.println("-----");
		
		//2. continue
		
		for(int i=1;i<=10;i++) {
			
			if(i==3 || i==5 || i==7) {
				continue;//if i== 3,5,7 it will skip current value and jump to next value
			}
			System.out.println(i);
		}

	}

}
