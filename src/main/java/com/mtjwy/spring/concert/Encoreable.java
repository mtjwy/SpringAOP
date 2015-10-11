package com.mtjwy.spring.concert;

public interface Encoreable {
	void performEncore();
	/*
	 * want to introduce the Encoreable interface to any implementation of
	 * Performance.
	 * 
	 * But it may not be possible to change all implementations of Performance,
	 * especially if you¡¯re working with third party implementations and don¡¯t
	 * have the source code.
	 * 
	 * How to do that, solution is
	 * 
	 * AOP introductions can help you without compromising design choices or
	 * requiring invasive changes to the existing implementations.
	 */
}

