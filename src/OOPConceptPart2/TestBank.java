package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCNBank hs = new HSBCNBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		
		hs.mutualFund();
		System.out.println(USBank.min_bal);

		//dynamic polymorphism ->
		//child class object can be referred by parent interface reference variable
		
		USBank b = new HSBCNBank();
		
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		//accessing interface variables
		System.out.println(USBank.min_bal);
		
		
	}

}
