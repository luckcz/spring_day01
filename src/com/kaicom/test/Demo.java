package com.kaicom.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaicom.bean.User;

public class Demo {
	@Test
	public void fun1(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			User user = (User)ac.getBean("user");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
