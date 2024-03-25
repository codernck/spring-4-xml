package com.learnspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BreadMain {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Bread paratha = context.getBean("paratha", Bread.class);
		
		// get the other bean
		Bread parotta = context.getBean("parotta", Bread.class);
		
		// call the method on bean
		System.out.println(paratha.getDescription());
		System.out.println(paratha.getAddon());
		// calling the other bean
		System.out.println(parotta.getDescription());
		System.out.println(parotta.getAddon());
		
		// close the context
		context.close();
	}

}
