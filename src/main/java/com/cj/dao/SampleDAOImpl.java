package com.cj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cj.dto.SampleDTO;

@Repository
public class SampleDAOImpl implements SampleDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sqlSession.selectList("sample.sampleList");
	}

	@Override
	public SampleDTO getSample(String id) throws Exception {
		return sqlSession.selectOne("sample.getSample", id);
	}

	@Override
	public void addSample(SampleDTO sample) throws Exception {
		sqlSession.insert("sample.addSample", sample);
		
	}

	@Override
	public int getCount() throws Exception {
		return sqlSession.selectOne("sample.sampleCount");
		
	}
	
	

}
