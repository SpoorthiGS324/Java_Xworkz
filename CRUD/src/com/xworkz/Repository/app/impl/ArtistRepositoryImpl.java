package com.xworkz.Repository.app.impl;

import com.xworkz.Repository.app.ArtistRepository;

public class ArtistRepositoryImpl implements ArtistRepository {

	private String[] paint = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void paint(String paintoingName) {
		if (position < TOTAL_ITEMS) {
			this.paint[position] = paintoingName;
			System.out.println("stored " + paintoingName + "is in the position" + this.position);
			this.position++;
		} else {
			System.err.println("storage is full");
		}

	}

}
