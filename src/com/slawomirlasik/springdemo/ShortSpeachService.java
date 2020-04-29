package com.slawomirlasik.springdemo;

public class ShortSpeachService implements SpeachService {

	@Override
	public String getSpeach() {
		return "Today I Had a dream. But I do not remember it";
	}

	public void checkTheTyposInSpeach() {
		System.out.println("------------------------------------");
		System.out.println("Checking the typos in speach...");
		System.out.println("No typos found.");
		System.out.println("------------------------------------");
	}

	public void burnThisSpeach() {
		System.out.println("------------------------------------");
		System.out.println("Burning this speach for good...");
		System.out.println("------------------------------------");

	}

}
