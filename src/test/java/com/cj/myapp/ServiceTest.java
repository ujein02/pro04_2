package com.cj.myapp;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
@Service
public class ServiceTest {
	
	private DAOTest daoTest;
	
	@Test
	public void serviceTest1() {
		int cnt = 5;
		try {
			cnt = serviceCall();
			log.info("서비스 단위 테스트가 성공적으로 처리되었음");
			log.info("회원수 : "+cnt);
			Assert.assertNotNull(cnt);
		} catch(Exception e) {
			log.info("서비스 단위 테스트가 실패 되었음");
			e.printStackTrace();
			fail("Service 단위 테스트 실패");
		}
	}
	
	public int serviceCall() {
		int cnt = daoTest.daoCall();
		return cnt;
	}

}
