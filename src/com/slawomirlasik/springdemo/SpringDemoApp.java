package com.slawomirlasik.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {

		// get context from spring
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		// get talker
		Talker slawkoTalker = context.getBean("slawkoSpeaker", Talker.class);

		// give speach
		slawkoTalker.giveSpeach();

		// close context
		context.close();

	}

}
