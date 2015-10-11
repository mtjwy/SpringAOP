package com.mtjwy.spring.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
	/*
	 * The value attribute identifies the kinds of beans that should be
	 * introduced with the interface. In this case, that¡¯s anything that
	 * implements the Performance interface.
	 * 
	 * The defaultImplattribute identifies the class that will provide the
	 * implementation for the introduction. Here you¡¯re saying that
	 * DefaultEncoreablewill provide that implementation.
	 * 
	 * The static property that is annotated by @DeclareParentsspecifies the
	 * interface that¡¯s to be introduced. In this case, you¡¯re introducing the
	 * Encoreable interface.
	 */
	@DeclareParents(value = "com.mtjwy.spring.concert.Performance+", defaultImpl = DefaultEncoreable.class)
	public static Encoreable encoreable;
}
