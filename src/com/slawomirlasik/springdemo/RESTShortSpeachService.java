package com.slawomirlasik.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTShortSpeachService implements SpeachService {

	@Override
	public String getSpeach() {
		return "Today I Had a dream. But I do not remember it";
	}

}
