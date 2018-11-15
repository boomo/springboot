package com.hancloud.springboot.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hancloud.springboot.mapper.SpecialValueMapper;
import com.hancloud.springboot.model.SpecialValue;
import com.hancloud.springboot.service.SpecialValueService;


@Service
public class SpecialValueServiceImpl implements SpecialValueService {
	
	@Autowired
	public SpecialValueMapper specialValueMapper;

	@Override
	public void add(SpecialValue value) {
		specialValueMapper.add(value);
	}

	@Override
	public List<SpecialValue> getByTaskId(int taskId) {
		return specialValueMapper.getByTaskId(taskId);
	}

	@Override
	public void delByTaskId(int taskId) {
		specialValueMapper.delByTaskId(taskId);
	}
	
	@Override
	public void batchDelByTaskId(String[] taskIds) {
		specialValueMapper.batchDelByTaskId(taskIds);
		
	}
	
	@Override
	public void batchAdd(List<SpecialValue> sList) {
		specialValueMapper.batchAdd(sList);		
	}
}
