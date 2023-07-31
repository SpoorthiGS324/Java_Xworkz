package program;

public class SportsKiller {

	public static void main(String[] args) {
		
		System.out.println("Running main in SportsRunner");
		String name="Cricket";
		
		Floor floor=new Floor("Ground Floor",0);
		Floor floor1=new Floor("First Floor",1);
		Floor floor2=new Floor("Second Floor",2);
		Floor floor3=new Floor("Third Floor",3);
		Floor floor4=new Floor("Four Floor",4);
		Floor floor5=new Floor("Fifth Floor",5);
		Floor floor6=new Floor("Sixth Floor",6);
		
		Floor[] floors= {floor, floor1, floor2, floor3, floor4, floor5, floor6};
		
		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);
		
		Lift[] lifts= {lift, lift1};
		
		Building building=new Building(floors,lifts);
		Building building1=new Building(floors,lifts);
		Building[] buildings= {building};
		
		
		Corporator corporator=new Corporator("Ariketh",buildings);
		Area area=new Area("Hudco colony", corporator);
		Area area1=new Area("Kengri", corporator);
		Area[] areas= {area,area1};
		HomeTown town=new HomeTown("Bangalore", 543500, areas );
		
		
		
		Player player=new Player("Gill",25,building,town);
		Player player1=new Player("Kohli",35,building,town);
		Player[] players= {player,player1};
		
		Sport sport=new Sport(name,players);
	    sport.printInfo();

	}
	



	}


