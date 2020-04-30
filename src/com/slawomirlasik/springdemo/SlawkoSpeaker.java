package com.slawomirlasik.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SlawkoSpeaker implements Talker {

	private SpeachService speachService;

	@Override
	public void giveSpeach() {
		System.out.println(speachService.getSpeach());
	}

	@Autowired
	public void setSpeachService(SpeachService speachService) {
		this.speachService = speachService;
	}

}
