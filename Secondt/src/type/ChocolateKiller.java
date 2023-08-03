package type;

public class ChocolateKiller {

	public static void main(String[] args) {
System.out.println("Invoking main in  ChocolateRunner ");
		
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil.run(caramelChocolate);
		ChocolateUtil.run(darkChocolate);

	}

}
