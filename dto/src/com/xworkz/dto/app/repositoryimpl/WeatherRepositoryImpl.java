package com.xworkz.dto.app.repositoryimpl;

import com.xworkz.dto.app.WeatherDTO;
import com.xworkz.dto.app.repository.WeatherRepository;

public class WeatherRepositoryImpl implements WeatherRepository {

	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_ITEMS];
	private int position;
	
	@Override
	public void save(WeatherDTO dto) {

		if (this.position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at index " + position);
			
			this.position++;
		} else {
			System.err.println("Out of range");
		}
		
	}

}
