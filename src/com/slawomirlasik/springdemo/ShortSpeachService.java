package com.slawomirlasik.springdemo;

import java.util.Random;

import org.springframework.beans.factory.DisposableBean;

public class ShortSpeachService implements SpeachService, DisposableBean {
	
	private String[] speaches = {
			"I had a dream... but I do not want to talk about it.",
			"I may start something big. But i do not wan to",
			"I know what I am doing. You must do what you know to"
	};

	private Random randomizer = new Random();
	
	private String speach = speaches[randomizer.nextInt(speaches.length)];
	
	@Override
	public String getSpeach() {
		return speach;
	}

	public void checkTheTyposInSpeach() {
		System.out.println("------------------------------------");
		System.out.println("Checking the typos in speach...");
		System.out.println("No typos found.");
		System.out.println("------------------------------------");
	}

	public void burnThisSpeach() throws Exception {
		destroy();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("------------------------------------");
		System.out.println("Burning this speach for good...");
		System.out.println("------------------------------------");
	}

}
