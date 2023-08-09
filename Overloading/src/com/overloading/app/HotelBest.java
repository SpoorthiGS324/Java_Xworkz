package com.overloading.app;

public class HotelBest extends Hotel {
	@Override
	public void hotel() {
		System.out.println("no arg in hotel");	
		}
	
	@Override
	public void hotel(String name) {
		System.out.println("hotel name is:"+name);	
		}
	
	@Override
	public void hotel(String name,int noOfServer) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		}
	
	@Override
	public void hotel(String name,int noOfServer,String location) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		System.out.println("hotel location is:"+location );
		}
	
	@Override
	public void hotel(String name,int noOfServer,String location,int time) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		System.out.println("hotel location is:"+location );
		System.out.println("hotel time is:"+time );
		}
	
	@Override
	public void hotel(String name,int noOfServer,String location,int time, float price) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		System.out.println("hotel location is:"+location );
		System.out.println("hotel time is:"+time );
		System.out.println("hotel price is:"+price );
		}
}


