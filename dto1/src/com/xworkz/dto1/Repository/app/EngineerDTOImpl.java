package com.xworkz.dto1.Repository.app;

import com.xworkz.dto1.app.EngineerDTO;

public class EngineerDTOImpl implements EngineerDTORepository {

	private EngineerDTO[] dtos = new EngineerDTO[TOTAL_ITEMS];
	int position;

	@Override
	public void save(EngineerDTO dto) {
		System.out.println("invoking main in EngineerDTOImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println("stored" + dto + "is in position" + this.position);
			this.position++;
		} else {
			System.err.println("storahe in full");
		}

	}

	@Override
	public boolean IsExist(String name) {
		for (int index = 0; index <= this.position; index++) {
			EngineerDTO temp = this.dtos[index];
			if (temp != null && temp.equals(name)) {
				System.out.println("engineer already exits");
				return true;
			}
		}

		return EngineerDTORepository.super.IsExist(name);

	}

}
