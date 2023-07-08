package com.mashcode.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	

	
	@Around("employeePointCuts()")
	public void work( ) {
		System.out.println("employee");
	}
	
	
	@Before( "studentPointCuts()")
	public void wakeup() {
		System.out.println("Good Morning");
	}
	
	@Pointcut("execution(public void com.mashcode.Student.study())")
	public void studentPointCuts() {}
	
	@Pointcut("execution(public void com.mashcode.Employee.study())")
	public void employeePointCuts() {}
	
}
