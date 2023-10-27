package com.xworkz.collection;

import java.util.HashSet;

public class MobileNumber {

	public static void main(String[] args) {

		HashSet<String> mobileNumbers = new HashSet<>();

		mobileNumbers.add("9876543224");
		mobileNumbers.add("5434567789");
		mobileNumbers.add("3456678899");
		mobileNumbers.add("5551234567");
		mobileNumbers.add("7551234567");
		mobileNumbers.add("5551234567");
		mobileNumbers.add("5551234567");
		mobileNumbers.add("9551234567");
		mobileNumbers.add("3551234567");
		mobileNumbers.add("5151234567");
		mobileNumbers.add("5251234567");
		mobileNumbers.add("5351234567");
		mobileNumbers.add("5851234567");
		mobileNumbers.add("5451234567");
		mobileNumbers.add("5651234567");

		mobileNumbers.add("4551234563");
		mobileNumbers.add("2551234568");
		mobileNumbers.add("6551234567");
		mobileNumbers.add("6655123456");
		mobileNumbers.add("2551234567");
		mobileNumbers.add("1551234567");
		mobileNumbers.add("8551234569");
		mobileNumbers.add("8551234565");
		mobileNumbers.add("7551234567");
		mobileNumbers.add("9551234569");
		mobileNumbers.add("8551234568");
		mobileNumbers.add("9551234560");
		mobileNumbers.add("4551284567");
		mobileNumbers.add("2551234597");
		mobileNumbers.add("4551294567");
		mobileNumbers.add("3571234567");

		System.out.println("Mobile Numbers:");
		for (String num : mobileNumbers) {
			System.out.println(num);
		}
	}

}
