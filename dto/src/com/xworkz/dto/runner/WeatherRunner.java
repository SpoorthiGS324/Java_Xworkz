package com.xworkz.dto.runner;

import com.xworkz.dto.app.WeatherDTO;
import com.xworkz.dto.app.repository.WeatherRepository;
import com.xworkz.dto.app.repositoryimpl.WeatherRepositoryImpl;
import com.xworkz.dto.service.WeatherService;
import com.xworkz.dto.serviceimpl.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {

		WeatherRepository repository = new WeatherRepositoryImpl();

		WeatherService service = new WeatherServiceImpl(repository);

		WeatherDTO dto = new WeatherDTO("Hot", 135, "Normal");

		WeatherDTO dto2 = new WeatherDTO(null, 0, null);

		WeatherDTO dto3 = new WeatherDTO("Cool", 120, null);

		WeatherDTO dto4 = new WeatherDTO("Normal", 122.3, "Strong");

		service.weatherValidate(dto);

		service.weatherValidate(dto2);

		service.weatherValidate(dto3);

		service.weatherValidate(dto4);
	}

}
