import java.text.NumberFormat;

//each BankAccount object represents one user's account 2 // information including name
//and balance of money.
// 11 AND 12
public class BankAccount {
	String name;
	double balance;
	double transactionFee = 0.0;

	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amount) {
		// will only withdraw if balance doesn't go negative
		if (balance >= amount + transactionFee) {
			balance = balance - (amount + transactionFee);
		} else {
			System.out.println("Unable to process transaction, insufficient funds");
		}
	}

	public void transactionFee(double transactionFee) {
		this.transactionFee = transactionFee;

	}

	public String getBalanceFormatted() {
		String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
		return formattedBalance;
	}

	@Override
	public String toString() {
		return (name + ", " + getBalanceFormatted());
	}

}
