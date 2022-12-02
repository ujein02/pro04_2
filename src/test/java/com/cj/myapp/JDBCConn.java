package com.cj.myapp;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCConn {
	private static final Logger logger = LoggerFactory.getLogger(JDBCConn.class);
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			if(conn!=null) {
				logger.info("오라클 연결 성공");
			} else {
				logger.info("오라클 연결 실패");
			}
			//conn.close();
		} catch(Exception e) {
			fail("Not yet implemented");
		}
	}
}
