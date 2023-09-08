package com.xworkz.dto.app;

import java.io.Serializable;

public class NewspaperDTO implements Serializable{

	@Override
	public String toString() {
		return "NewspaperDTO [name=" + name + ", cost=" + cost + ", publisher=" + publisher + ", lang=" + lang + "]";
	}

	private String name;
	private double cost;
	private String publisher;
	private String lang;
	
	public NewspaperDTO(String string) {
		
	}

	
	public NewspaperDTO(String name, double cost, String publisher, String lang) {
		super();
		this.name = name;
		this.cost = cost;
		this.publisher = publisher;
		this.lang = lang;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	}

