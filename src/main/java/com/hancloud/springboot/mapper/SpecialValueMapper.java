package com.hancloud.springboot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hancloud.springboot.model.SpecialValue;


public interface SpecialValueMapper {

	public void add(SpecialValue value);
	
	public List<SpecialValue> getByTaskId(int taskId);
	
	public void delByTaskId(int taskId);

	public void batchDelByTaskId(@Param(value="taskIds") String[] taskIds);

	public void batchAdd(@Param(value="list") List<SpecialValue> sList);
}
