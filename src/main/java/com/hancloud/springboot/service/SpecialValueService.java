package com.hancloud.springboot.service;

import java.util.List;

import com.hancloud.springboot.model.SpecialValue;


public interface SpecialValueService {

	public void add(SpecialValue value);
	
	public List<SpecialValue> getByTaskId(int taskId);
	
	public void delByTaskId(int taskId);

	public void batchDelByTaskId(String[] taskIds);

	public void batchAdd(List<SpecialValue> sList);
}
