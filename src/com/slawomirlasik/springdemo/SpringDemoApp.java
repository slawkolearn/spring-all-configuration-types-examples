package com.slawomirlasik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {

		// get context from spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get talker
		SlawkoSpeaker slawkoTalker = context.getBean("slawkoSpeaker", SlawkoSpeaker.class);

		// give speach
		slawkoTalker.giveSpeach();
		
		// get the email and the school
		System.out.println("Email: " + slawkoTalker.getEmail());
		System.out.println("School: " + slawkoTalker.getSchool());

		// close context
		context.close();

	}

}
