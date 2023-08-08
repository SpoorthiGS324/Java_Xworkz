package polymorphism.app;

public class TicketBooking extends Ticket{
	@Override
	public void allow() {
		System.out.println("Invoking no arg constructor in TicketBooking");
	}
}
