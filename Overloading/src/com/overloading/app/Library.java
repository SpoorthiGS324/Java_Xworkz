package com.overloading.app;

public class Library {
	public void bookStore() {
		System.out.println("no arg in bookstore");
	}

	public void bookStore(String bookName) {
		System.out.println("invoking main String in bookname");
		System.out.println("NAME OF THE BOOK : " + bookName);
	}

	public void bookStore(String bookName, String author) {
		System.out.println("invoking main String,String in bookname");
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
	}

	public void bookStore(String bookName, String author, int noOfCopies) {
		System.out.println("invoking main String,String,int in bookname");
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
		System.out.println("No OF Copies : " + noOfCopies);
	}

	public void bookStore(String location, int pincode) {
		System.out.println("invoking main location,int in bookname");
		System.out.println("LOCATION : " + location);
		System.out.println("PINCODE : " + pincode);
	}

	public void bookStore(double cost) {
		System.out.println("invoking main double in bookname");
		System.out.println("COST : " + cost);
	}

}
