package com.xworkz.app;

public class PersonKiller {

	public static void main(String[] args) {
		System.out.println("Running main in PersonRunner");

		Person person = new PersonEmploye();

		person.run();
		person.eat();
		person.work();
		person.sleep();
		person.relax();

		System.out.println(person.getOccupation());
		person.study();
		person.celebrateBirthday();
		person.exercise();
		person.getHome();
	}


	}


