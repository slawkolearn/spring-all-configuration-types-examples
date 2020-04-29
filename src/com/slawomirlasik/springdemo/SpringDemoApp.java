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
		
		// get the other slawko speaker
		SlawkoSpeaker otherSlawkoSpeaker = context.getBean("slawkoSpeaker", SlawkoSpeaker.class);
		
		// check if they are twins
		boolean twins = (slawkoTalker == otherSlawkoSpeaker);
		
		// print the message about slawko twin status
		System.out.println();
		System.out.println( twins ? "They are twins" : "They are not twins");
		
		System.out.println();
		System.out.println("Proof:");
		System.out.println(slawkoTalker);
		System.out.println(otherSlawkoSpeaker);
		System.out.println();

		// close context
		context.close();

	}

}
