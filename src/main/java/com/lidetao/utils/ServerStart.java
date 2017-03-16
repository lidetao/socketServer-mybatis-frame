package com.lidetao.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerStart {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 加载项目配置文件
		new ClassPathXmlApplicationContext("applicationContext.xml",
				"applicationContext-dba.xml");
	}

}
