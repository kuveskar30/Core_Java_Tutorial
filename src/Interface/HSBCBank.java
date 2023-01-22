package Interface;



public class HSBCBank implements USBankInterface, BrazilBank {//we are achieving multiple inheritance
	//Is-a relationship

	//class must have all methods of interface which it is implementing, otherwise it will show an error
	//If a class implementing any interface, it is mandatory to define/override all methods of interface
	
	//overriding from USbank
	public void credit() {
		System.out.println("HSBC Bank -- credit method");
	}
	
	public void debit() {
		System.out.println("HSBC Bank -- debit method");
	}
	
	public void transferMoney() {
		System.out.println("HSBC Bank -- transfer money method");
	}
	
	//separate methods
	public void educationLoan() {
		System.out.println("HSBC Bank -- education loan method");
	}
	
	//overriding from brazil bank
	
	public void mutualFund() {
		System.out.println("hsbc bank mutual fund");
	}


	
}
