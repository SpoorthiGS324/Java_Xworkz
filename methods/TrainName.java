public class TrainName{
	static String getTrainName(int trainNumber){
		System.out.println("Train Number");
		if(trainNumber >= 1000)
		{
			if(trainNumber == 11013)
			{
				System.out.println("Train number is: " + trainNumber);
				return "CombatoreExpress";
			}
			if(trainNumber == 11014)
			{
				System.out.println("Train number is: " + trainNumber);
				return "MumbaiExpress";
			}
			if(trainNumber == 12134)
			{
				System.out.println("Train number is: " + trainNumber);
				return "VibhutiJunction";
			}
			if(trainNumber == 22691)
			{
				System.out.println("Train number is: " + trainNumber);
				return "RajdhaniExpress";
			}
		}
		else
		{
			System.out.println("Train number is invalid");
		}
		return "Train";
	}
	
}