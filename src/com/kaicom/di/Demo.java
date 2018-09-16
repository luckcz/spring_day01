package com.kaicom.di;

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
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/di/applicationContext.xml");
			User user = (User)ac.getBean("user");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/di/applicationContext.xml");
			Teacher teacher = (Teacher)ac.getBean("teacher");
			System.out.println(teacher);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/di/applicationContext.xml");
			Teacher teacher = (Teacher)ac.getBean("teacher2");
			System.out.println(teacher);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/di/applicationContext.xml");
			Teacher teacher = (Teacher)ac.getBean("teacher3");
			System.out.println(teacher);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/di/applicationContext.xml");
			User user = (User)ac.getBean("user4");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun6(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/di/applicationContext.xml");
			CollectionBean collectionBean = (CollectionBean)ac.getBean("cb");
			System.out.println(collectionBean);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
