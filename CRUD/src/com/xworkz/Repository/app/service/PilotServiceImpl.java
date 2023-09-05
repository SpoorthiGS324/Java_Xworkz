package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.Pilot;

public class PilotServiceImpl implements PilotService {

	private Pilot pilot;

	public PilotServiceImpl(Pilot pilot) {
		this.pilot=pilot;
	}
	
	@Override
	public boolean list(String names) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(names!=null && !names.isEmpty() && names.length()>=3 && names.length()>=0)
		{
			System.out.println("Pilot names is valid..");
			this.pilot.list(names);
		}
		else
		{
			System.err.println("Pilot names is invalid, cannot save..");
		}
	
		return false;
	}

}
