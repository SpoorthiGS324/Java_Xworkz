package program;

public class Sport {
	
	public String name;
	public Player[] players;

	public Sport(String name, Player[] players) {
		this.name = name;
		this.players = players;

	}

	public void printInfo() {
		System.out.println("Running printInfo in Sport");
		System.out.println("Name :" + this.name);

		

		for (int i = 0; i < this.players.length; i++) {
			Player ref = players[i];
			ref.printInfo();
			
			
		}
	}

.

}
