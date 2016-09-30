package com.feng.impl;

import com.feng.DemoService;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) throws Exception {
		if("Excetion".equals(name)){
			throw new Exception("myException");
		}
		return "Hello " + name;
	}
}