package com.learnspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BreadMain {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container-we are not using the base interface here
		Paratha paratha = context.getBean("paratha", Paratha.class);
		
		// get the other bean-we are not using the base interface here
		Parotta parotta = context.getBean("parotta", Parotta.class);
		
		// call the method on bean
		System.out.println(paratha.getDescription());
		System.out.println(paratha.getCountry()+"---"+paratha.getContinent());
		
		// calling the other bean
		System.out.println(parotta.getDescription());
		System.out.println(parotta.getCountry()+"---"+parotta.getContinent());
		
		// close the context
		context.close();
	}

}
