package spoo.app;

public class RopeKiller {

	public static void main(String[] args) {
		
			System.out.println("Invoking main in  RopeKiller");
			Rope rope=new Rope("Soft",545,"White",870);
			System.out.println(rope.material);
			System.out.println(rope.price);
			System.out.println(rope.color);
			System.out.println(rope.length);
			
			System.out.println("--------------------------");
			RopeAnother ropeanother=new RopeAnother();
			System.out.println(ropeanother.material);
			System.out.println(ropeanother.price);
			System.out.println(ropeanother.color);
			System.out.println(ropeanother.length);
			
			System.out.println("--------------------------");
			RopeAnother ropeanother1=new RopeAnother("Hard",545,"Black",865);
			System.out.println(ropeanother1.material);
			System.out.println(ropeanother1.price);
			System.out.println(ropeanother1.color);
			System.out.println(ropeanother1.length);
	}

}
