package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.GroceryRepository;
import com.xworkz.Repository.app.impl.GoceryRepositoryimpl;

public class GroceryRunner {

	public static void main(String[] args) {

		GroceryRepository repo = new GoceryRepositoryimpl();
		repo.save("Sugar");
		repo.save("Chilli");
		repo.save("Maidha");
		repo.save("Wheat");
		repo.save("Tomoto");
		repo.save("Onion");
		repo.save("Maggie");
		repo.save("Potato");
		repo.save("Salt");
		repo.save("Biscuits");
		
	}

}
