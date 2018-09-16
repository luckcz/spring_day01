package com.kaicom.create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaicom.bean.User;

public class Demo {
	//������ʽ1���ղι���
	@Test
	public void fun1(){
		try{
			// 1.������������
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/create/applicationContext.xml");
			User user = (User)ac.getBean("user");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	//������ʽ2����̬����
	@Test
	public void fun2(){
		try{
			// 1.������������
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/create/applicationContext.xml");
			User user = (User)ac.getBean("user2");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	//������ʽ3��ʵ������
	@Test
	public void fun3(){
		try{
			// 1.������������
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/create/applicationContext.xml");
			User user = (User)ac.getBean("user3");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
