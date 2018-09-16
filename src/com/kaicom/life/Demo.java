package com.kaicom.life;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaicom.bean.Teacher;
import com.kaicom.bean.User;

public class Demo {
	//测试生命周期
	@Test
	public void fun1(){
		try{
			// 1.创建容器对象
			ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/life/applicationContext.xml");
			ac.close();
			/*User user = (User)ac.getBean("user");
			System.out.println(user);*/
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/life/applicationContext.xml");
			Teacher teacher = (Teacher)ac.getBean("teacher");
			System.out.println(teacher);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	//创建方式3：实例工厂
	@Test
	public void fun3(){
		try{
			// 1.创建容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/kaicom/create/applicationContext.xml");
			User user = (User)ac.getBean("user3");
			System.out.println(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
