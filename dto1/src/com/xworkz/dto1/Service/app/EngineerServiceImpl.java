package com.xworkz.dto1.Service.app;

import com.xworkz.dto1.Repository.app.EngineerDTORepository;
import com.xworkz.dto1.app.EngineerDTO;

public class EngineerServiceImpl implements EngineerService {

	private EngineerDTORepository engineerDTORepository;
	private int position;

	public EngineerServiceImpl(EngineerDTORepository engineerDTORepository) {
		super();
		this.engineerDTORepository = engineerDTORepository;

	}

	@Override
	public boolean validateandSave(EngineerDTO dto) {
		System.out.println("invoking main in validateandSave ");
		if (dto != null) {
			String name = dto.getName();
			String collegeName = dto.getCollegeName();
			int id = dto.getId();

			if (name != null && !name.isEmpty() && name.length() < 3 && name.length() <= 20) {
				System.out.println("name " + dto.getName() + "is valid");
			} else {
				System.err.println(dto.getName() + "is not valid");
				return false;
			}

			if (collegeName != null && !collegeName.isEmpty() && collegeName.length() > 3
					&& collegeName.length() <= 20) {
				System.out.println("collegename" + dto.getCollegeName() + "is valid");
			} else {
				System.err.println(dto.getCollegeName() + "is not valid");
				return false;

			}

			if (id > 0) {
				System.out.println("id" + dto.getId() + "is valid");
			} else {
				System.err.println(dto.getId() + "is not valid");
				return false;
			}

			this.engineerDTORepository.save(dto);
			return true;
		} else {
			System.err.println("enginner is in valid");
		}

		return false;
	}

}
