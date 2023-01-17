package com.cj.service;

import java.util.List;

import com.cj.dto.SampleDTO;

public interface SampleService {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;
	public void addSample(SampleDTO sample) throws Exception;
	public int getCount() throws Exception;

}
