package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.PoliticanRepository;

public class PoliticanServiceImpl implements PoliticanRepository {

	private PoliticanRepository politicanRepository;

	public PoliticanServiceImpl(PoliticanRepository politicianRepository) {
		this.politicanRepository=politicanRepository;
	}
	
	@Override
	public void help(String designation) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Politician names is valid..");
			this.politicanRepository.list(names);
		}
		else
		{
			System.err.println("Politician names is invalid, cannot save..");
		}
	}

}
