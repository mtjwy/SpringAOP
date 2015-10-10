package com.mtjwy.spring.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
public class Audience {

	//Declaring a frequently used pointcut expression with @Pointcut
	@Pointcut("execution(* com.mtjwy.spring.concert.Performance.perform(..))")
	public void perform() {}
	
	//The advice method is called before the advised method is called.
	@Before("perform()")
	public void silenceCellPhones() {
		System.out.println("Silencing cell Phones");
	}
	
	@Before("perform()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	//The advice method is called after the advised method returns.
	@AfterReturning("perform()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	//The advice method is called after the advised method throws an exception.
	@AfterThrowing("perform()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
	
	
}
