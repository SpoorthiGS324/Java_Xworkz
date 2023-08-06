package spoo.app;

public class CoffeKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in CoffeKiller");
		Coffe coffe=new Coffe("Black Coffee",56,"Sunrise",true);
		System.out.println(coffe.name);
		System.out.println(coffe.price);
		System.out.println(coffe.brand);
		System.out.println(coffe.tasty);
		
		System.out.println("------------------------");
		CoffeCold coffecold=new CoffeCold();
		System.out.println(coffecold.name);
		System.out.println(coffecold.price);
		System.out.println(coffecold.brand);
		System.out.println(coffecold.tasty);
		
		System.out.println("------------------------");
		CoffeCold coffecold1=new CoffeCold("Cold Coffee",78,"Continental",true);
		System.out.println(coffecold1.name);
		System.out.println(coffecold1.price);
		System.out.println(coffecold1.brand);
		System.out.println(coffecold1.tasty);

	}
}


