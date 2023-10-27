package com.xworkz.dto1.app;

import java.io.Serializable;

public class EngineerDTO implements Serializable {

	private String name;
	private int id;
	private String collegeName;

	public EngineerDTO(String name, int id, String collegeName) {
		super();
		this.name = name;
		this.id = id;
		this.collegeName = collegeName;
	}

	public EngineerDTO() {

	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "EngineerDTO [name=" + name + ", id=" + id + ", collegeName=" + collegeName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
