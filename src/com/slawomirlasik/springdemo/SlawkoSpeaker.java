package com.slawomirlasik.springdemo;

public class SlawkoSpeaker implements Talker {

	private String email;

	private String school;

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

	public String getEmail() {
		return email;
	}

	public String getSchool() {
		return school;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	
}
