package spoo.app;

public class GroundKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in GroundKiller");
		Ground ground=new Ground("Nehru","137m",11,"Shimoga");
		System.out.println(ground.name);
		System.out.println(ground.dimension);
		System.out.println(ground.noOfPlayer);
		System.out.println(ground.location);
		
		System.out.println("----------------------------");
		GroundCricket groundcricket=new GroundCricket();
		System.out.println(groundcricket.name);
		System.out.println(groundcricket.dimension);
		System.out.println(groundcricket.noOfPlayer);
		System.out.println(groundcricket.location);

		System.out.println("----------------------------");
		GroundCricket groundcricket1=new GroundCricket("Modhi","150m",11,"Gujarat");
		System.out.println(groundcricket1.name);
		System.out.println(groundcricket1.dimension);
		System.out.println(groundcricket1.noOfPlayer);
		System.out.println(groundcricket1.location);


	}

}
