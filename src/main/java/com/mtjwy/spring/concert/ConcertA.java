package com.mtjwy.spring.concert;

import org.springframework.stereotype.Component;

@Component
public class ConcertA implements Performance, Scannable {
	
	public void perform() {
		System.out.println("Playing concert");
	}
}
