package com.kaicom.bean;

public class User {
	private String name ;
	private Integer age ;
	public User(){
		System.out.println("User����ղι��췽��");
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
		System.out.println("user�����ʼ��");
	}
	public void destroy(){
		System.out.println("user��������");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
