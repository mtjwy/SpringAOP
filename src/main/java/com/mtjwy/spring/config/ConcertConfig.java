package com.mtjwy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.mtjwy.spring.concert.Audience;
import com.mtjwy.spring.concert.Scannable;

@Configuration
@EnableAspectJAutoProxy//turn on auto-proxying to interpreted @Aspect annotations and created the proxies that turn the annotated class bean into an aspect
@ComponentScan(basePackageClasses = Scannable.class)
public class ConcertConfig {
	
	@Bean
	public Audience audience() {
		return new Audience();
	}
	
}
