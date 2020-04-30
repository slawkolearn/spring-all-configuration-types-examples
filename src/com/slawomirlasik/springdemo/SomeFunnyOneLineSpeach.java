package com.slawomirlasik.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeFunnyOneLineSpeach implements SpeachService {
	
	@Value("${foo.joke}")
	private String jokeFromFile;

	@Override
	public String getSpeach() {
		return jokeFromFile;
	}

}
