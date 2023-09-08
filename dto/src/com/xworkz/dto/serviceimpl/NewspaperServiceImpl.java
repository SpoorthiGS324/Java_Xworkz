package com.xworkz.dto.serviceimpl;


import com.xworkz.dto.app.NewspaperDTO;
import com.xworkz.dto.app.repository.NewspaperRepository;
import com.xworkz.dto.service.NewspaperService;

public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperRepository newspaperRepository;
	private int position;

	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository = newspaperRepository;
	}
	
	@Override
	public boolean validateAndSave(NewspaperDTO dto) {

		System.out.println("invoking validate and save " + this.getClass().getSimpleName());
		if(dto!=null) {
			System.out.println("Newspaper data is valid"+this.position);
			
			String name=dto.getName();
			String publisher = dto.getPublisher();
			String lang = dto.getLang();
			
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=20) {
				System.out.println("Newspaper"+dto.getName() +"is valid");
			}else {
				System.err.println(dto.getName() + "is not valid");
						return false;
			}
			
			this.newspaperRepository.save(dto);
			return true;
		}
		else {
			System.err.println("newspaper is invalid");
		}
		
		return false;
	}

}
