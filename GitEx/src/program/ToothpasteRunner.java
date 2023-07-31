package program;

public class ToothpasteRunner {

	public static void main(String[] args) {
		
System.out.println("Running main in ToothpasteRunner");
		
		String name="Close up";
		String brand="Colgate";
		Company company=new Company("DaberRed","Spoorthi","India");
		 Ingredents ingredients = new Ingredents("salt", 9.7f, 60);
		 Ingredents ingredients1 = new Ingredents("Sugar", 5.2f, 30);
		 Ingredents ingredients2 = new Ingredents("water", 1.2f, 10);
		 Ingredents ingredients3 = new Ingredents("Garlic", 1.6f, 10); 
		 Ingredents ingredients4 = new Ingredents(" Zinc Phosphate", 1.3f, 20);
		 Ingredents[] ingredents= {ingredients,ingredients1,ingredients2,ingredients3,ingredients4};
	     

	        Toothpaste toothpaste = new Toothpaste(name, brand, company, ingredents);
	        toothpaste.printInfo();
	    
		

	}
		

	}


