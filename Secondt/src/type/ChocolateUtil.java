package type;

public class ChocolateUtil extends Chocolate {
public static void run(Chocolate chocolate) {
		
		if(chocolate instanceof DarkChocolate)
		{
			System.out.println("Invoking Darkchocolate");
			DarkChocolate darkChocolate=(DarkChocolate)chocolate;
			System.out.println(darkChocolate.name);
			System.out.println(darkChocolate.price);
			darkChocolate.eat();
			darkChocolate.taste();
			System.out.println("*********");
			
		}
		if(chocolate instanceof CaramelChocolate)
		{
			System.out.println("Invoking CaramelChocolate");
			CaramelChocolate caramelChocolate=(CaramelChocolate)chocolate;
			System.out.println(caramelChocolate.brand);
			System.out.println(caramelChocolate.price);
			caramelChocolate.eat();
			caramelChocolate.variety();
			System.out.println("*********");
			
		}
		
	}
}
