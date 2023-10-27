package arrays;

public class Email {

	public static void main(String[] args) {
	
		System.out.println("Running main in Email");
		{
			String spoo = "spoo@gmail.com";
			String deepu = "deepu@gmail.com";
			String govind = "govind@gmail.com ";
			String maanya = "maanya@gmail.com";
			String tanu = "tanu@gmailcom";
			String samarth = "samarth@gmail.com";

			
			String[] emails = { spoo, deepu, govind, maanya, tanu, samarth };

			String ref = emails[0];
			System.out.println(" spoo email is:" + ref);

			String ref1 = emails[1];
			System.out.println(" deepu email is :" + ref1);

			String ref2 = emails[2];
			System.out.println(" govind email is:" + ref2);

			String ref3 = emails[3];
			System.out.println(" maanya email is:" + ref3);

			String ref4 = emails[4];
			System.out.println(" tanu email is  :" + ref4);

			String ref5 = emails[5];
			System.out.println(" smarath email is:" + ref5);

			
			for(int start=0; start<emails.length; start++)
			{
				String email= emails[start];
				System.out.println("the email"+email+"is"+start);
				
			}
		}
	}

}
