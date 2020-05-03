package com.slawomirlasik.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SlawkoSpeaker implements Talker {

	private SpeachService speachService;

	
	public SlawkoSpeaker(SpeachService speachService) {
		super();
		this.speachService = speachService;
	}

	@Override
	public void giveSpeach() {
		System.out.println(speachService.getSpeach());
	}

}
