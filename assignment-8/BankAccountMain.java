
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount jenn = new BankAccount ("Jenn", 1000000);
		BankAccount reality = new BankAccount ("Reality", 20);

		jenn.transactionFee(25);
		jenn.withdraw(8000);
		System.out.println(jenn.toString());
		
		System.out.println();
		
		//insufficient funds
		reality.transactionFee(25);
		reality.withdraw(100);
		System.out.println(reality.toString());
		//reality.deposit(500);
		//System.out.println(reality.balance);
	}

}
