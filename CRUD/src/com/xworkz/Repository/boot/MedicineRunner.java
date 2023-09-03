package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.Medicine;
import com.xworkz.Repository.app.impl.MedicineImpl;

public class MedicineRunner {

	public static void main(String[] args) {
	
		
		Medicine ref = new MedicineImpl();
		ref.cure("paracetomal");
		ref.cure("cymbalta");
		ref.cure("lisinopril");
		ref.cure("tramadol");
		ref.cure("trazodone");
		ref.cure("ativan");
		ref.cure("gabapentin");
		ref.cure("metformin");
		ref.cure("omeprazole");
		ref.cure("diazepam");
		
	}

}
