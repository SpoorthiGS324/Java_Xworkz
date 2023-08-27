package com.xworkz.built;

public class LocalDateTime {

	public static void main(String[] args) {

		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime specificDateTime = LocalDateTime.of(2023, Month.AUGUST, 22, 15, 30, 0);
		LocalDateTime parsedDateTime = LocalDateTime.parse("2023-08-22T15:30:00");

		// Getting parts of the date and time
		int year = currentDateTime.getYear();
		Month month = currentDateTime.getMonth();
		int dayOfMonth = currentDateTime.getDayOfMonth();
		int hour = currentDateTime.getHour();
		int minute = currentDateTime.getMinute();
		int second = currentDateTime.getSecond();

		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day of Month: " + dayOfMonth);
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
		System.out.println("Second: " + second);
	}

}


