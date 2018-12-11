
public class WalkupTicket extends Ticket {

	public WalkupTicket(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return getNumber() * 50;
	}

}
