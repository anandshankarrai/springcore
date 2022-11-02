package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/NewConfig.xml");
		Company comp = (Company) context.getBean("company");
		System.out.println(comp);

	}

}
