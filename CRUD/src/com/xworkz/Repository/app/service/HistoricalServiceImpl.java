package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.HistoricalRepo;

public class HistoricalServiceImpl implements HistoricalService {

	private HistoricalRepo historicalRepo;
	public HistoricalServiceImpl(HistoricalRepo historicalRepo) {
		this.historicalRepo=historicalRepo;
	}
	
	@Override
	public boolean venue(String names) {
		
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Historical Places names is valid..");
			this.historicalRepo.view(names);
		}
		else
		{
			System.err.println("Historical Places names is invalid, cannot save..");
		}
		
		return false;
	}

}
