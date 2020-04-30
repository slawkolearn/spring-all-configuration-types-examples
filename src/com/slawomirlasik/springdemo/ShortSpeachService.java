package com.slawomirlasik.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myServiceComponentManuallySet")
public class ShortSpeachService implements SpeachService {
	
	@Value("${foo.speach}")
	private String speach;

	@Override
	public String getSpeach() {
		return speach;
	}

}
