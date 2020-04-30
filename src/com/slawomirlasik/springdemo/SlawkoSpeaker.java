package com.slawomirlasik.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SlawkoSpeaker implements Talker {

	@Autowired
	private SpeachService speachService;

	@Override
	public void giveSpeach() {
		System.out.println(speachService.getSpeach());
	}

}
