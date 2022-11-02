package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTestClass {

	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/ci/NewConfig.xml");
		Person p =(Person) ap.getBean("person");
		System.out.println(p);
		
		
	}
	
}
