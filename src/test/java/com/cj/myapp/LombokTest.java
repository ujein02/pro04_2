package com.cj.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cj.dto.SampleDTO;
public class LombokTest {
	private static final Logger logger = LoggerFactory.getLogger(LombokTest.class);
	
	@Test
	public void testLombok() {
		SampleDTO dto = new SampleDTO();
		dto.setName("kkk");
		dto.setAge(20);
		dto.setIq(100);
	
		logger.info(dto.toString());
	}
}
