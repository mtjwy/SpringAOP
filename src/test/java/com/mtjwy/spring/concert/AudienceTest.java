package com.mtjwy.spring.concert;


import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mtjwy.spring.config.ConcertConfig;

@RunWith(SpringJUnit4ClassRunner.class)//use SpringJUnit4ClassRunner to have a Spring application context automatically created when the test starts.
@ContextConfiguration(classes=ConcertConfig.class) //tells spring to load its configuration from the ConcertConfig class.
public class AudienceTest {
	
	
	/*
	 * Testing code that uses System.out.println()is a tricky business.
	 * Therefore, here we use StandardOutputStreamLog, a JUnit rule from
	 * the System Rules library
	 * (http://stefanbirkner.github.io/system-rules/index.html) that lets us
	 * make assertions against whatever is written to the console.
	 */
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private Performance concertA;
	
	@Test
	public void testAspect() {
		concertA.perform();
		
		/*
		 * Here it¡¯s asserting that the message from the SgtPeppers.play() method
		 * was sent to the console.
		 */
	    assertEquals(
	        "Silencing cell Phones\r\n" +
	        		"Taking seats\r\n" +
	        		"Playing concert\r\n" +
	        		"CLAP CLAP CLAP!!!\r\n", //StandardOutputStreamLog window \r\n  //linux \n
	        		log.getLog());
		/*
		 * If you verify logs that contain line separators than the separators
		 * are different (e.g. Linux: \n , Windows: \r\n ).
		 */
	}

}
