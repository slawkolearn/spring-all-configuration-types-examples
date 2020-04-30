package com.slawomirlasik.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeFunnyOneLineSpeach implements SpeachService {

	@Override
	public String getSpeach() {
		return "\n-----------------\nQ: What did the SNAIL say while riding on the turtles back?\nA: Wheeeeeeeee\n-------------";
	}

}
