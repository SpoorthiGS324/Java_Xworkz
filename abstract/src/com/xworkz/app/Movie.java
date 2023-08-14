package com.xworkz.app;

public abstract class Movie {
	
	public void music() {
		System.out.print("invoking main music  in movie");
	}
	
	public boolean suspense() {
		System.out.println("invoking main suspense in movie");
		return true;
	}
	
	public void sound() {
		System.out.println("invoking main sound in movie");
	}
	
	public boolean watch() {
		System.out.println("invoking main watch in movie");
		return true;
	}
	
	public void visualArt() {
		System.out.println("invoking main visualArt in movie ");
	}
	
	public abstract boolean enjoy();
	public abstract boolean speedTime();
	public abstract boolean thriller();
	public abstract boolean inspiration();
	public abstract boolean expreesion();
}

