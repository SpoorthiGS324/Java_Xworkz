public class Person{
	static int getAgeByName(String personAge)
	{
		System.out.println("Price of the cloth");
		if(personAge != null)
		{
			if(personAge == "spoo")
			{
				System.out.println("person is: " + personAge);
				return 22;
			}
			if(personAge == "deepu")
			{
				System.out.println("person is: " + personAge);
				return 24;
			}
			if(personAge == "adhi")
			{
				System.out.println("person is: " + personAge);
				return 28;
			}
			if(personAge == "maanya")
			{
				System.out.println("person is: " + personAge);
				return 16;
			}
			if(personAge == "sam")
			{
				System.out.println("person is: " + personAge);
				return 10;
			}
			if(personAge == "rekha")
			{
				System.out.println("person is: " + personAge);
				return 45;
			}
			if(personAge == "govind")
			{
				System.out.println("person is: " + personAge);
				return 50;
			}
			if(personAge == "chandu")
			{
				System.out.println("person is: " + personAge);
				return 48;
			}
			if(personAge == "megha")
			{
				System.out.println("person is: " + personAge);
				return 25;
			}
			if(personAge == "sru")
			{
				System.out.println("person is: " + personAge);
				return 56;
			}
		}
		else
        {
			System.out.println("Age is not acceptable");
		}
		return 0;
	}
	
		public static void main(String[] args)
		{
		int Agespoo = getAgeByName("spoo");
		System.out.println("ref is: " + Agespoo );
		
        int Agedeepu = getAgeByName("deepu");
		System.out.println("ref is: " + Agedeepu);
		
        int Ageadhi = getAgeByName("adhii");
		System.out.println("ref is: " + Ageadhi);
		
		int Agemaanya = getAgeByName("maanya");
		System.out.println("ref is: " + Agemaanya);
		
		int Agesam = getAgeByName("sam");
		System.out.println("ref is: " + Agesam);
		
		double Agerekha = getAgeByName("rekha");
		System.out.println("ref is: " + Agerekha);
		
		int Agegovind = getAgeByName("govind");
		System.out.println("ref is: " + Agegovind);
		
		int Agechandu = getAgeByName("chandu");
		System.out.println("ref is: " + Agechandu);
		
		int Agemegha = getAgeByName("megha");
		System.out.println("ref is: " + Agemegha);
		
		int Agesru = getAgeByName("sru");
		System.out.println("ref is: " + Agesru);
	}
}