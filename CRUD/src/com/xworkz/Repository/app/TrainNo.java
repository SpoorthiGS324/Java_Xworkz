package com.xworkz.Repository.app;

public interface TrainNo {
	
int TOTAL_ITEMS = 5;
	
	void store(String name);
	
	 default boolean IsExist(String name) {
		 
		return false;	
		
	 }


}
