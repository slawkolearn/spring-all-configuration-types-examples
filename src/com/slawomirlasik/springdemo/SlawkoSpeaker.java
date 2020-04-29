package com.slawomirlasik.springdemo;

public class SlawkoSpeaker implements Talker {

	private SpeachService speachService;

	public SlawkoSpeaker() {
		super();
	}

	
	
	public void setSpeachService(SpeachService speachService) {
		this.speachService = speachService;
	}



	@Override
	public void giveSpeach() {
		System.out.println(speachService.getSpeach());
	}

}
