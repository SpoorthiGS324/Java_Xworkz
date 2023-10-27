package com.xworkz.police;

public class Exception {

	public void sleep() {
		this.drink();
		System.out.println("sleep info.....");
	}

	public void drink() {
		this.walk();
		System.out.println("drink info.....");
	}

	public void walk() {
		this.dance();
		System.out.println("walk info.....");
	}

	public void dance() {
		System.out.println("dance info.....");
		try {
			this.eat();
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("exception event is handled.....");
		}
		
		System.out.println("after handling....");
	}

	public void eat() {
		System.out.println("eat info.....");
		System.out.println("not calling method.....");
		throw new IllegalStateException("unchecked event");
		
	}

	public static void main(String[] args) {
		Exception exception = new Exception();
		exception.sleep();
	
	}
	
}
