package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.Patient;
import com.xworkz.Repository.app.impl.PatientImpl;

public class PatientRunner {

	public static void main(String[] args) {

		Patient ref = new PatientImpl();
		ref.sleep("maanya");
		ref.sleep("megha");
		ref.sleep("deep");
		ref.sleep("spoo");
		ref.sleep("rekha");
		ref.sleep("govind");
		ref.sleep("adhi");
		ref.sleep("sru");
		ref.sleep("sonu");
		ref.sleep("meghu");
	}

}
