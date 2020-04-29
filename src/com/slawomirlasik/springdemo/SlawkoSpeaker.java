package com.slawomirlasik.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
