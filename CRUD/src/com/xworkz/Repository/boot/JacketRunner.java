package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.JacketRepository;
import com.xworkz.Repository.app.impl.JacketRepositoryImpl;

public class JacketRunner {

	public static void main(String[] args) {

		JacketRepository ref = new JacketRepositoryImpl();
		ref.wear("jean");
		ref.wear("leather");
		ref.wear("vest");
		ref.wear("puffer");
		ref.wear("parka");
		ref.wear("duffle");
		ref.wear("nehru");
		ref.wear("smoking");
		ref.wear("denin");
		ref.wear("sleeveless");
	}

}
