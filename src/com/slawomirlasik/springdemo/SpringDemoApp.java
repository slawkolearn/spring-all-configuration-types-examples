package com.slawomirlasik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {

		// get context from spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get talker
		Talker slawkoTalker = context.getBean("slawkoSpeaker", Talker.class);

		// give speach
		slawkoTalker.giveSpeach();

		// close context
		context.close();

	}

}
