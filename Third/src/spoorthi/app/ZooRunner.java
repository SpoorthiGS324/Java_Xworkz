package spoorthi.app;

public class ZooRunner {

	public static void main(String[] args) {
System.out.println("Running main in ZooRunner");
		
		Zoo zoo=new Zoo();
		NationalZoo nationalZoo=new NationalZoo();
		StateZoo stateZoo=new StateZoo();
		
		ZooUtil.run(stateZoo);
		ZooUtil.run(nationalZoo);
		
	}

	}


