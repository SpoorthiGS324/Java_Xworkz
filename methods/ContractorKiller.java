class ContractorKiller{
	
	public static void main(String[] args)
	{
		Contractor.person();
		System.out.println("\n");
		
		Contractor.contractor();
		System.out.println("\n");
		
		Contractor.contractor("Maanya");
		System.out.println("\n");
		
		Contractor.contractor("Adhi",12);
		System.out.println("\n");
		
		Contractor.contractor("Seenu",7, 20000);
		System.out.println("\n");
		
		Contractor.payment(30000);
		System.out.println("\n");
		
		Contractor.payment(50000, 9865346789l);
		System.out.println("\n");
		
		Contractor.contact(7975153403l);
		System.out.println("\n");
		
		Contractor.plan();
		System.out.println("\n");
		
		Contractor.address();
		System.out.println("\n");
		
		Contractor.contractorSupervise();
		System.out.println("\n");
		
	}
	
}