package com.kaicom.bean;

public class Teacher {
	private String t_name ;
	private Integer t_age ;
	private User user ;
	public Teacher(){
		System.out.println("老师的无参构造");
	}
	public Teacher(String t_name, User user) {
		super();
		System.out.println("老师的有参构造(String t_name, User user)");
		this.t_name = t_name;
		this.user = user;
	}
	public Teacher(Integer t_name, User user) {
		super();
		System.out.println("老师的有参构造(Integer t_name, User user)");
		this.t_name = t_name.toString();
		this.user = user;
	}
	public Teacher(User user, String t_name) {
		super();
		System.out.println("老师的有参构造(User user, String t_name)");
		this.t_name = t_name;
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public Integer getT_age() {
		return t_age;
	}
	public void setT_age(Integer t_age) {
		this.t_age = t_age;
	}
	public void init(){
		System.out.println("Teacher对象初始化");
	}
	public void destroy(){
		System.out.println("Teacher对象销毁");
	}
	@Override
	public String toString() {
		return "Teacher [t_name=" + t_name + ", t_age=" + t_age + ", user=" + user + "]";
	}
}
