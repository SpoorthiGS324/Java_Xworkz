package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {

	
	private JuiceRepository juiceRepository;
	
	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}
	
	@Override
	public boolean validateAndSave(String name) {
		System.out.println("invoking validate and save "+this.getClass().getSimpleName());
		if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20)
		{
			System.out.println("juice data is valid");
			if(!this.juiceRepository.IsExist(name))
			{
			this.juiceRepository.store(name);
			return true;
		}
		
		else {
			System.err.println("juice name" +name+ "already exits add another one ");
		}
		}
		else
		{
			System.err.println("juice name "+name+ "is valid");
		}
		
	
		return false;

}
}
