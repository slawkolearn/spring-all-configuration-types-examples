package com.slawomirlasik.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// notice that we do not do the component scan anymore
public class SpringConfiguration {
	
	@Bean
	public Talker slawkoSpeaker() {
		return new SlawkoSpeaker(shortSpeachService());
	}
	
	@Bean
	public SpeachService shortSpeachService() {
		return new ShortSpeachService();
	}

}
