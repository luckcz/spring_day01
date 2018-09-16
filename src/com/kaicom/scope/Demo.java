package com.kaicom.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaicom.bean.Teacher;
import com.kaicom.bean.User;

public class Demo {
	@Test
	public void fun1(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/scope/applicationContext.xml");
			User user1 = (User)ac.getBean("user");
			User user2 = (User)ac.getBean("user");
			User user3 = (User)ac.getBean("user");
			User user4 = (User)ac.getBean("user");
			System.out.println(user1 == user2);//true  singleton  prototype
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/scope/applicationContext.xml");
			Teacher teacher1 = (Teacher)ac.getBean("teacher");
			Teacher teacher2 = (Teacher)ac.getBean("teacher");
			System.out.println(teacher1 == teacher2);//false prototype
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
