public class Email{
	static String getEmailByName(String personEmail)
	{
		System.out.println("Running main in email");
		if(personEmail != null)
		{
			if(personEmail == "spoo")
			{
				System.out.println("person is: " + personEmail);
				return "spoo@gmail.com";
			}
			if(personEmail == "deepu")
			{
				System.out.println("person is: " + personEmail);
				return "deepu@gmail.com";
			}
			if(personEmail == "sam")
			{
				System.out.println("person is: " + personEmail);
				return "sam@gmail.com";
			}
			if(personEmail == "reenu")
			{
				System.out.println("person is: " + personEmail);
				return "reenu@gmail.com";
			}
			if(personEmail == "adhi")
			{
				System.out.println("person is: " + personEmail);
				return "adhi@gmail.com";
			}
			if(personEmail == "seenu")
			{
				System.out.println("person is: " + personEmail);
				return "seenu@gmail.com";
			}
			if(personEmail == "megh")
			{
				System.out.println("person is: " + personEmail);
				return "megh@gmail.com";
			}
			if(personEmail == "rekha")
			{
				System.out.println("person is: " + personEmail);
				return "rekha@gmail.com";
			}
			if(personEmail == "govind")
			{
				System.out.println("person is: " + personEmail);
				return "govind@gmail.com";
			}
			if(personEmail == "keerth")
			{
				System.out.println("person is: " + personEmail);
				return "keerth@gmail.com";
			}
			
		}
			else
			{
				System.out.println("Email is not acceptable");
			}
			return "Email";
	}
			
			public static void main(String[] args)
			{
				String ref1 = getEmailByName("spoo");
				System.out.println("email is: " + ref1);
				
				String ref2 = getEmailByName("deepu");
				System.out.println("email is: " + ref1);
				
				String ref3 = getEmailByName("sam");
				System.out.println("email is: " + ref3);
				
				String ref4 = getEmailByName("reenu");
				System.out.println("email is: " + ref4);
				
				String ref5 = getEmailByName("adhi");
				System.out.println("email is: " + ref5);
				
				String ref6 = getEmailByName("seenu");
				System.out.println("email is: " + ref6 );
				
				String ref7 = getEmailByName("megh");
				System.out.println("email is: " + ref7 );
				
				String ref8 = getEmailByName("rekha");
				System.out.println("email is: " + ref8 );
				
				String ref9 = getEmailByName("govind");
				System.out.println("email is: " + ref9);
				
				String ref10 = getEmailByName("keerth");
				System.out.println("email is: " + ref10 );
				
			}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			