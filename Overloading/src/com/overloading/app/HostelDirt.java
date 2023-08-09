package com.overloading.app;

public class HostelDirt extends Hostel{
	
	@Override
	public void roomFacility() {
		System.out.println(" no-arg");
	}

	@Override
	public void roomFacility(String hotelName) {
		
		System.out.println("Name Of Hotel : " + hotelName);
	}

	@Override
	public void roomFacility(int noOfRooms) {
		System.out.println("Number OF Room : " + noOfRooms);
	}

	@Override
	public void roomFacility(int noOfRooms, int roomNumber) {
		System.out.println("NO of Rooms : " + noOfRooms);
		System.out.println("Room Number : " + roomNumber);
	}

	@Override
	public void roomFacility(String hotelName, int noOfRooms, int roomNumber) {
		System.out.println("Name Of Hotel : " + hotelName);
		System.out.println("NO of Rooms : " + noOfRooms);
		System.out.println("Room Number : " + roomNumber);
	}

	@Override
	public boolean roomFacility(boolean hasSecurity) {
		return true;
	}

}
