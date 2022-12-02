package com.cj.myapp.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper2 {
	@Select("SELECT to_char(sysdate, 'YYYY-MM-DD hh:mm:ss') FROM dual")
	public String getTime1();
}