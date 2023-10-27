package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.PoliticanRepository;
import com.xworkz.Repository.app.impl.PoliticanRepositoryImpl;

public class PoliticanRunner {

	public static void main(String[] args) {

		PoliticanRepository ref = new PoliticanRepositoryImpl();
		ref.help("Prime minister");
		ref.help("chief minister");
		ref.help("vice president");
		ref.help("secretary");
		ref.help("deputy president");
		ref.help("commite member");
		ref.help("chairman");
		ref.help("assistent");
		ref.help("judge");
		ref.help("permanent chairman");

	}

}
