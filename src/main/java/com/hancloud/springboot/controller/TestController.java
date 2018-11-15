package com.hancloud.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hancloud.springboot.model.SpecialValue;
import com.hancloud.springboot.model.User;
import com.hancloud.springboot.service.SpecialValueService;

@RestController
public class TestController {

	@Autowired
	private SpecialValueService service;
	
	@Autowired
	private User user;
	
	@Value("${date}")
	private String date;
	@RequestMapping("/date")
	public String test(){
		return date;
	}
	
	@RequestMapping("/user")
	public String user(){
		return user.getName() + "\t" + user.getPwd();
	}
	
	@ResponseBody
	@RequestMapping("/special")
	public List<SpecialValue> special(){
		List<SpecialValue> list = service.getByTaskId(56);
		return list;
	}

	public void  t(){

	}
}
