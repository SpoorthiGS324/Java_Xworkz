package com.xworkz.dto.app;

import java.io.Serializable;

public class AadharDTO implements Serializable{

	private long number;
	private String address;
	private String name;

	public long getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "AadharDTO [number=" + number + ", address=" + address + ", name=" + name + "]";
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AadharDTO(long number, String address, String name) {
		super();
		this.number = number;
		this.address = address;
		this.name = name;
	}

	public AadharDTO() {
		
	}
	
	
	
	
	
}
