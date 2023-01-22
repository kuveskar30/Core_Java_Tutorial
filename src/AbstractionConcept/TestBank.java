package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank tb = new HDFCBank();
		
		tb.credit();
		tb.debit();
		tb.loan();
		tb.funds();
		
		Bank tb2 = new HDFCBank();//dynamic/runtime polymorphism
		tb2.credit();
		tb2.debit();
		tb2.loan();
		
	}
	
	
}
