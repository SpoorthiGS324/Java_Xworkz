package com.xworkz.built;

public class StringBuilderRunner {

	public static void main(String[] args) {

		StringBuilder build=new StringBuilder("Spoorthi Fromm Bhadravathi");
		
		System.out.println(build);
		
		StringBuilder builder= build.append(false);
		
		System.out.println(builder);
		
		int a=build.indexOf("S");
		System.out.println("The index of character s is "+a);
		
		builder=build.reverse();
		System.out.println(builder);
		
		builder=build.reverse();
		System.out.println(builder);
		
		String name="jeep";
		
		int i=build.lastIndexOf(name);
		System.out.println("The last index of name is "+i);
		
	}

}
