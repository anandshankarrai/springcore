package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		System.out.println("Hello World again");
		System.out.println("Hello World again and again");

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/config.xml");
		Student student =  (Student) context.getBean("student1");
		Student student2 =  (Student) context.getBean("Student2");
		System.out.println(student);
		System.out.println(student2);
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		System.out.println("address is "+emp.getAddresses());

	}
}
