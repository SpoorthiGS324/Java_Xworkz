package polymorphism.app;

public class TicketKiller {

	public static void main(String[] args) {
		
			System.out.println("Running main in TicketKiller");
			
			Ticket ticket=new TicketBooking();
			ticket.allow();
		}
}


