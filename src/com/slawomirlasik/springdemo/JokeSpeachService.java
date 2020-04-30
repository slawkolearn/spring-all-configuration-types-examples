package com.slawomirlasik.springdemo;

public class JokeSpeachService implements SpeachService {

	@Override
	public String getSpeach() {
		return "\n--------------------\nWhat's the best thing about Switzerland?\n" + 
				"\n" + 
				"I don't know, but the flag is a big plus\n-----------------------";
	}

}
