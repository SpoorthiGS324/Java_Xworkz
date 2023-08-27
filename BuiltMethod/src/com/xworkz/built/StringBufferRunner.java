package com.xworkz.built;

public class StringBufferRunner {

	public static void main(String[] args) {

		StringBuffer stringbuffer = new StringBuffer();
		
		
		StringBuffer ref = stringbuffer.append(false);
		System.out.println(ref);
		
		StringBuffer ref1 = stringbuffer.append(12);
		System.out.println(ref1);
		
		StringBuffer ref2 = stringbuffer.append(0);
		System.out.println(ref2);
		
		StringBuffer ref3 = stringbuffer.append("spoo");
		System.out.println(ref3);
		
		StringBuffer ref4 = stringbuffer.append("spoo", 12, 31);
		System.out.println(ref4);
		
		StringBuffer ref5 = stringbuffer.append(10.0);
		System.out.println(ref5);
		
		StringBuffer ref6 = stringbuffer.append(98657654);
		System.out.println(ref6);
		
		StringBuffer ref7 = stringbuffer.append(ref6);
		System.out.println(ref7);
		
		StringBuffer ref8 = stringbuffer.append(1230.00);
		System.out.println(ref8);
		
		
		
	}

}
