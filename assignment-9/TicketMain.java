
public class TicketMain {

	public static void main(String[] args) {

		Ticket[] tickets = new Ticket[4];
		tickets[0] = new WalkupTicket(2);
		tickets[1] = new WalkupTicket(3);
		tickets[2] = new WalkupTicket(1);
		tickets[3] = new WalkupTicket(8);

		for (int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i].toString());

		}
	}

}
