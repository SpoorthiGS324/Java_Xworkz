class TrainNameKiller{
	public static void main(String[] args)
	{
		
		System.out.println("Running main in TrainNameKiller");
		
		String trainCombatore = TrainName.getTrainName(11013);
		System.out.println("ref is: " + trainCombatore);
		
		String trainMumbai= TrainName.getTrainName(11014);
		System.out.println("ref is: " + trainMumbai);
		
		String trainRajdhani = TrainName.getTrainName(22691);
		System.out.println("ref is: " + trainRajdhani);
		
		String trainVibhuti = TrainName.getTrainName(12134);
		System.out.println("ref is: " + trainVibhuti);
	}
}