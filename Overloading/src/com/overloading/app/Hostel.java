package com.overloading.app;

public class Hostel {
	public void roomFacility() {
		System.out.println("no arg in Hostel");
	}

	public void roomFacility(String hotelName) {
		System.out.println("invoking main String in roomFacility");
		System.out.println("Name Of Hotel : " + hotelName);
	}

	public void roomFacility(int noOfRooms) {
		System.out.println("invoking main int in roomFacility");
		System.out.println("Number OF Room : " + noOfRooms);
	}

	public void roomFacility(int noOfRooms, int roomNumber) {
		System.out.println("invoking main int,int in roomFacility");
		System.out.println("NO of Rooms : " + noOfRooms);
		System.out.println("Room Number : " + roomNumber);
	}

	public void roomFacility(String hotelName, int noOfRooms, int roomNumber) {
		System.out.println("invoking main String,int,int in roomFacility");
		System.out.println("Name Of Hotel : " + hotelName);
		System.out.println("NO of Rooms : " + noOfRooms);
		System.out.println("Room Number : " + roomNumber);
	}

	public boolean roomFacility(boolean hasSecurity) {
		System.out.println("invoking main boolaen in roomFacility");
		return true;
	}

}
