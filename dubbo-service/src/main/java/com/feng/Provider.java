package com.feng;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "service.xml" });
		System.out.println("发布成功");
		context.start();
		System.in.read(); // 按任意键退出 } }
	}
}