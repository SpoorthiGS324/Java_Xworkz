package place;

public class ShowroomKiller {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();
		MobileShowroom mobileShowroom = new MobileShowroom();
		WatchShowroom watchShowroom=new WatchShowroom();

		ShowroomUtil.run(showroom);
		ShowroomUtil.run(watchShowroom);
		ShowroomUtil.run(mobileShowroom);
	   
		

	}

	}


