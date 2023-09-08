package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.WeatherDTO;

public interface WeatherRepository {

	int TOTAL_ITEMS = 5;

	void save(WeatherDTO dto);
}
