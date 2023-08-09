package com.overloading.app;

public class LibraryNew extends Library{

	@Override
	public void bookStore() {
		System.out.println("no arg in bookstore");
	}

	@Override
	public void bookStore(String bookName) {
		System.out.println("NAME OF THE BOOK : " + bookName);
	}

	@Override
	public void bookStore(String bookName, String author) {
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
	}

	@Override
	public void bookStore(String bookName, String author, int noOfCopies) {
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
		System.out.println("No OF Copies : " + noOfCopies);
	}

	@Override
	public void bookStore(String location, int pincode) {
		System.out.println("LOCATION : " + location);
		System.out.println("PINCODE : " + pincode);
	}

	@Override
	public void bookStore(double cost) {
		System.out.println("COST : " + cost);
	}
}
