package com.spoo.app;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class StringClass {

	public static void main(String[] args) {
		
		
		String value = "kengri";
		System.out.println("value at 12:"+value.charAt(12));
		
		System.out.println("===============================================");
		
		String[] array=value.split("d");
		for(int index=0; index<array.length;index++)
		{
		System.out.println(array[index]);
		}
			
		System.out.println("===============================================");
		
		
		String[] array2=value.split("k",4);
		for(int index=0; index<array2.length;index++)
		{
		System.out.println("value for "+array2[index]);
		}
		
		
		System.out.println("===============================================");
		
		
		String value1 = value.concat("Spoorthi");
		System.out.println(value1);
		

		System.out.println("=============================================");
		
		int value2=value.compareTo("Shimoga");
		System.out.println(value2);
		
		System.out.println("=============================================");
		
		System.out.println(value.substring(2, 5));
		
		System.out.println("=============================================");
		
		System.out.println(value.isEmpty());
		
		System.out.println("=============================================");
		
		System.out.println(value.length());
		
		System.out.println("=============================================");
		
		System.out.println(value.startsWith("K"));
		
		System.out.println("=============================================");
		
		System.out.println(value.endsWith("i"));
		
		System.out.println("=============================================");
		
		System.out.println(value.equalsIgnoreCase("kengri"));
		
		System.out.println("=============================================");
		
		System.out.println(value.equals("Kengri"));
		
		System.out.println("=============================================");
		
		System.out.println(value.toUpperCase());
		
		System.out.println("=============================================");
		
		System.out.println(value.toCharArray());
		
		System.out.println("=============================================");
		
		System.out.println(value.isEmpty());
		
		System.out.println("=============================================");
		
		System.out.println(value.indexOf(23));
						
		System.out.println("=============================================");
		
		String ref = "Browser";
		System.out.println(ref.trim());
		
		
		
		System.out.println("JAVA.UTIL.DATE  METHODS");
		
		
		Date date = new Date(2000,12,9);
		Date date2 = new Date(2000,12,23);
		
		System.out.println(date2.after(date));
		
		Date date3 = new Date(2006,12,9);

		System.out.println(date.before(date3));
		
		System.out.println(date.clone());
		
		System.out.println(date2.compareTo(date));
		
		System.out.println(date.getTime());
		
		System.out.println("JAVA.TIME.LOCALDATE   METHODS");
		
		
		System.out.println(LocalDate.of(2000, 12, 9));
		
		System.out.println(LocalDate.parse("2001-11-03"));
		
		System.out.println(LocalDate.ofEpochDay(5));
		
		
		System.out.println("JAVA.TIME.LOCALDATETIME METHODS");

		System.out.println(LocalDateTime.now());

	
		System.out.println(LocalDateTime.of(2023, 10, 22, 10, 20));


		System.out.println(LocalDateTime.of(2023, 10, 22, 12, 0, 0));

		System.out.println("JAVA.LANG.THREAD METHODS");

		System.out.println(Thread.activeCount());

		System.out.println(Thread.interrupted());

		System.out.println(Thread.currentThread());

		System.out.println(Thread.getDefaultUncaughtExceptionHandler());

		System.out.println(Thread.holdsLock(ref));

		System.out.println("JAVA.LANG.SYSTEM METHODS");

		System.out.println(System.lineSeparator());

		System.out.println(System.clearProperty(ref));

		System.out.println(System.nanoTime());

		System.out.println(System.getenv(ref));

		System.out.println(System.identityHashCode(ref));
		
		

	}

}
