package com.cj.myapp;

import org.junit.Test;

public class JDBCTest {
	JDBCConn t1 = new JDBCConn();
	
	@Test
	public void test() {
		t1.testConnection();
	}
}
