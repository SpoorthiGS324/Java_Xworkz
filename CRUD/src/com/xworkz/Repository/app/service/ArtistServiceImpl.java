package com.xworkz.Repository.app.service;

import com.xworkz.Repository.app.ArtistRepository;

public class ArtistServiceImpl implements ArtistService {

	private ArtistRepository artistRepository;
		
	public ArtistServiceImpl(ArtistRepository  artistRepository) {
		this.artistRepository = artistRepository;
	}
	
	@Override
	public boolean list(String paintingName) {
	System.out.println("invoking validate and save "+this.getClass().getSimpleName());
	if(paintingName!=null && !paintingName.isEmpty() && paintingName.length()>=0 && paintingName.length()>=3 )
	{
		System.out.println("Artist names is valid..");
		this.artistRepository.paint(paintingName);
	}
	else {
		System.out.println("Artist names is invalid,cannot save");
	}
		return false;
	}

}
