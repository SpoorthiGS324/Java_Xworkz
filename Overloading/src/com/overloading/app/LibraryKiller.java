package com.overloading.app;

public class LibraryKiller {

	public static void main(String[] args) {
	System.out.println("invoking main in LibrarayKiller");
	
	Library ref = new Library();
	ref.bookStore();
	ref.bookStore("Money");
	ref.bookStore("Money","Deepak");
	ref.bookStore("Money","Deepak",25);
	ref.bookStore("Bengluru",577301);
	ref.bookStore(1000.0d);
	
	
	System.out.println("======================");
	
	Library ref1 = new LibraryNew();
	ref1.bookStore();
	ref1.bookStore("hesist");
	ref1.bookStore("hesist","spoo");
	ref1.bookStore("hesist","spoo",15);
	ref1.bookStore("Bengluru",577401);
	ref1.bookStore(2000.0d);
	
	System.out.println("======================");
	
	LibraryNew ref2 = new LibraryNew();
	ref2.bookStore();
	ref2.bookStore("sumamry");
	ref2.bookStore("summary","maanya");
	ref2.bookStore("summary","maanya",20);
	ref2.bookStore("Bengluru",577601);
	ref2.bookStore(1500.0d);
	}

}
