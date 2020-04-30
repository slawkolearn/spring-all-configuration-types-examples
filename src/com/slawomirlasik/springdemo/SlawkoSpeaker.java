package com.slawomirlasik.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SlawkoSpeaker implements Talker {

	private SpeachService speachService;

	@Autowired
	public SlawkoSpeaker(SpeachService speachService) {
		super();
		this.speachService = speachService;
	}

	@Override
	public void giveSpeach() {
		System.out.println(speachService.getSpeach());
	}

}
