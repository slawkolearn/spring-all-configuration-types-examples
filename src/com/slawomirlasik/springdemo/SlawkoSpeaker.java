package com.slawomirlasik.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
	
	// from java 9+ the @PostContruct @PreDestroy annotations are gone and have to be added to classpath manually
	@PostConstruct
	public void doPreparationForSpeach() {
		System.out.println("Shawing legs. Doing A O E I U ... ");
	}
	
	// !!! for the prototype scope beans spring do not call the PreDestroy methods.!!!
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Cleaning the speach place..");
	}

}
