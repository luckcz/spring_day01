package com.kaicom.bean;

public class User {
	private String name ;
	private Integer age ;
	public User(){
		System.out.println("User对象空参构造方法");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void init(){
		System.out.println("user对象初始化");
	}
	public void destroy(){
		System.out.println("user对象销毁");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
