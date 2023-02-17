package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"./com/springcore/component/compConfig.xml");

//		Student student1 = context.getBean("student_1", Student.class);
//
//		System.out.println(student1);

		Person person = context.getBean("person1", Person.class);

		System.out.println(person);
	}

}
