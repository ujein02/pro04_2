package com.cj.dao;

import java.util.List;

import com.cj.dto.SampleDTO;

public interface SampleDAO {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;
	public void addSample(SampleDTO sample) throws Exception;
	public int getCount() throws Exception;
}
