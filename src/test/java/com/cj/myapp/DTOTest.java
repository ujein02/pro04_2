package com.cj.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cj.dto.MemberDTO;

public class DTOTest {
	private static final Logger logger = LoggerFactory.getLogger(DTOTest.class);
	
	@Test
	public void testDto() {
		MemberDTO dto = new MemberDTO();
		dto.setId("test");
		dto.setPw("1234");
		dto.setName("테스트");
		dto.setTel("01011111111");
		dto.setAddr1("일산동구");
		dto.setPt(100);
		dto.setRegdate("2022-11-21");
		
		logger.info(dto.toString());
	}
}
