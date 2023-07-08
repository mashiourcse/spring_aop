package com.mashcode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student t = con.getBean("student", Student.class);
		Employee e = con.getBean("employee", Employee.class);
		
		
		e.study();
	}

}
