import java.text.NumberFormat;

public abstract class Ticket {

	private int number;

	public Ticket(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public abstract double getPrice();

	public String formattedPrices() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.getPrice());
		return formattedPrice;
	}

	@Override
	public String toString() {
		return ("Number: " + number + " Price: " + formattedPrices());
	}

}
