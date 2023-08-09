package com.overloading.app;

public class Hotel {
	
	public void hotel() {
		System.out.println("no arg in hotel");	
		}
	
	public void hotel(String name) {
		System.out.println("hotel name is:"+name);	
		}
	
	public void hotel(String name,int noOfServer) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		}
	
	public void hotel(String name,int noOfServer,String location) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		System.out.println("hotel location is:"+location );
		}
	
	public void hotel(String name,int noOfServer,String location,int time) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		System.out.println("hotel location is:"+location );
		System.out.println("hotel time is:"+time );
		}
	
	public void hotel(String name,int noOfServer,String location,int time, float price) {
		System.out.println("hotel name is:"+name);	
		System.out.println("hotel have noOfServer is:"+noOfServer);
		System.out.println("hotel location is:"+location );
		System.out.println("hotel time is:"+time );
		System.out.println("hotel price is:"+price );
		}
	
}

